package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _B: ImageVector? = null

val Icons.Bs.B: ImageVector
    get() = _B ?: UXIcon(name = "B") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 24f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2f, 3.5f)
                curveTo(2f, 1.57f, 3.57f, 0f, 5.5f, 0f)
                horizontalLineToRelative(7f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                curveToRelative(0f, 1.51f, -0.52f, 2.9f, -1.39f, 4.01f)
                curveToRelative(2.57f, 1.04f, 4.38f, 3.56f, 4.38f, 6.49f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                close()
                moveTo(5f, 13f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(15f, 21f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                lineTo(5f, 13f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(6.5f)
                close()
            }
        }.also { _B = it}
