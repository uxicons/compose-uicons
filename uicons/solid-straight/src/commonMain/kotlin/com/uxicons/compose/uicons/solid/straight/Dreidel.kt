package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dreidel: ImageVector? = null

val Icons.Ss.Dreidel: ImageVector
    get() = _Dreidel ?: UXIcon(name = "Dreidel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.41f, 9f)
                lineToRelative(4.74f, 4.74f)
                lineToRelative(-9.21f, 9.21f)
                lineToRelative(-0.9f, -0.78f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 18.5f)
                arcToRelative(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.13f, -3.21f)
                lineToRelative(2.95f, -2.95f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(8.71f, 13.87f)
                arcTo(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.44f, 15f)
                arcToRelative(4.89f, 4.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.62f, -2.04f)
                lineTo(1.01f, 12.1f)
                lineToRelative(9.25f, -9.25f)
                lineTo(15f, 7.59f)
                lineTo(22.54f, 0.05f)
                lineTo(23.95f, 1.46f)
                close()
                moveTo(7f, 18.5f)
                arcToRelative(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, -1.69f)
                arcTo(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.44f, 17f)
                arcTo(6.9f, 6.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.23f, 14.17f)
                lineTo(0f, 13.94f)
                verticalLineTo(20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(6.06f)
                lineToRelative(-0.23f, -0.23f)
                arcTo(7.06f, 7.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 18.5f)
                close()
            }
        }.also { _Dreidel = it}
