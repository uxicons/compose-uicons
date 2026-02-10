package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dreidel: ImageVector? = null

val Icons.Bs.Dreidel: ImageVector
    get() = _Dreidel ?: UXIcon(name = "Dreidel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 2.15f)
                lineTo(21.84f, 0.03f)
                lineTo(15f, 6.88f)
                lineTo(10.26f, 2.14f)
                lineTo(0f, 12.4f)
                verticalLineToRelative(7.1f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 24f)
                horizontalLineToRelative(7.1f)
                lineTo(21.86f, 13.74f)
                lineTo(17.12f, 9f)
                close()
                moveTo(3f, 19.5f)
                lineTo(3f, 16.23f)
                arcTo(6.59f, 6.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.94f, 17f)
                arcToRelative(8.97f, 8.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.12f, -0.07f)
                arcTo(8.79f, 8.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 18f)
                arcToRelative(6.74f, 6.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.78f, 3f)
                lineTo(4.5f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19.5f)
                close()
                moveTo(10.94f, 20.41f)
                arcTo(4.41f, 4.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 18f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.98f, -2.86f)
                lineToRelative(2.08f, -2.08f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(8.86f, 13.02f)
                arcTo(4.05f, 4.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.94f, 14f)
                arcToRelative(4.23f, 4.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.36f, -0.94f)
                lineToRelative(6.68f, -6.68f)
                lineToRelative(7.35f, 7.35f)
                close()
            }
        }.also { _Dreidel = it}
