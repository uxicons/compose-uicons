package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dreidel: ImageVector? = null

val Icons.Rs.Dreidel: ImageVector
    get() = _Dreidel ?: UXIcon(name = "Dreidel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.95f, 1.46f)
                lineTo(22.54f, 0.05f)
                lineTo(15f, 7.59f)
                lineTo(10.26f, 2.85f)
                lineTo(0f, 13.11f)
                lineTo(0f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(6.89f)
                lineTo(21.15f, 13.74f)
                lineTo(16.41f, 9f)
                close()
                moveTo(2f, 20f)
                lineTo(2f, 15.85f)
                arcTo(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.44f, 17f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.73f, -0.18f)
                arcTo(7.86f, 7.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18.5f)
                arcTo(6.65f, 6.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.17f, 22f)
                lineTo(4f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                close()
                moveTo(10.42f, 21.64f)
                arcTo(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 18.5f)
                arcToRelative(4.39f, 4.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.13f, -3.21f)
                lineToRelative(2.95f, -2.95f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(8.71f, 13.87f)
                arcTo(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.44f, 15f)
                arcToRelative(4.86f, 4.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.08f, -1.42f)
                lineToRelative(7.91f, -7.91f)
                lineToRelative(8.06f, 8.06f)
                close()
            }
        }.also { _Dreidel = it}
