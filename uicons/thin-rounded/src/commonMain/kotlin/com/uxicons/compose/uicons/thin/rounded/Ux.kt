package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ux: ImageVector? = null

val Icons.Tr.Ux: ImageVector
    get() = _Ux ?: UXIcon(name = "Ux") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(19.74f, 7.06f)
                curveToRelative(-0.24f, -0.13f, -0.55f, -0.05f, -0.68f, 0.19f)
                lineToRelative(-2.06f, 3.71f)
                lineToRelative(-2.06f, -3.71f)
                curveToRelative(-0.14f, -0.24f, -0.44f, -0.33f, -0.68f, -0.19f)
                curveToRelative(-0.24f, 0.13f, -0.33f, 0.44f, -0.19f, 0.68f)
                lineToRelative(2.37f, 4.26f)
                lineToRelative(-2.37f, 4.26f)
                curveToRelative(-0.13f, 0.24f, -0.05f, 0.55f, 0.19f, 0.68f)
                curveToRelative(0.08f, 0.04f, 0.16f, 0.06f, 0.24f, 0.06f)
                curveToRelative(0.17f, 0f, 0.35f, -0.09f, 0.44f, -0.26f)
                lineToRelative(2.06f, -3.71f)
                lineToRelative(2.06f, 3.71f)
                curveToRelative(0.09f, 0.17f, 0.26f, 0.26f, 0.44f, 0.26f)
                curveToRelative(0.08f, 0f, 0.17f, -0.02f, 0.24f, -0.06f)
                curveToRelative(0.24f, -0.13f, 0.33f, -0.44f, 0.19f, -0.68f)
                lineToRelative(-2.37f, -4.26f)
                lineToRelative(2.37f, -4.26f)
                curveToRelative(0.13f, -0.24f, 0.05f, -0.55f, -0.19f, -0.68f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 4.5f)
                close()
            }
        }.also { _Ux = it}
