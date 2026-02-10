package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sword: ImageVector? = null

val Icons.Bs.Sword: ImageVector
    get() = _Sword ?: UXIcon(name = "Sword") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.27f, 0.73f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.31f, -0.67f)
                lineToRelative(-3.97f, 1.29f)
                lineToRelative(-11.57f, 11.57f)
                arcToRelative(15.07f, 15.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.21f, -1.41f)
                lineToRelative(-0.43f, 2.97f)
                arcToRelative(12.3f, 12.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.67f, 1.94f)
                lineToRelative(-2.24f, 2.24f)
                lineToRelative(-1.05f, -1.05f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(2.24f, -2.24f)
                arcToRelative(12.29f, 12.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.95f, 4.67f)
                lineToRelative(2.97f, -0.43f)
                arcToRelative(15.06f, 15.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -4.21f)
                lineToRelative(11.57f, -11.57f)
                lineToRelative(1.29f, -3.97f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, -2.31f)
                close()
                moveTo(20.02f, 5.4f)
                lineTo(9.4f, 16.02f)
                curveToRelative(-0.21f, -0.25f, -0.43f, -0.5f, -0.67f, -0.74f)
                reflectiveCurveToRelative(-0.49f, -0.46f, -0.74f, -0.67f)
                lineToRelative(10.61f, -10.62f)
                lineToRelative(2.1f, -0.69f)
                close()
            }
        }.also { _Sword = it}
