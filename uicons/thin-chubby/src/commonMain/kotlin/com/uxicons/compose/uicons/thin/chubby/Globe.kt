package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Globe: ImageVector? = null

val Icons.Tc.Globe: ImageVector
    get() = _Globe ?: UXIcon(name = "Globe") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.89f, 1f, 1.03f, 2.25f, 1.03f, 12f)
                curveToRelative(0f, 7.71f, 3.28f, 11f, 10.97f, 11f)
                curveToRelative(5.11f, 0f, 10.97f, -1.25f, 10.97f, -11f)
                curveToRelative(0f, -7.71f, -3.28f, -11f, -10.97f, -11f)
                close()
                moveTo(12.06f, 22f)
                curveToRelative(-0.02f, 0f, -0.11f, 0f, -0.13f, 0f)
                curveToRelative(-1.75f, -0.02f, -3.53f, -0.84f, -4.14f, -5.76f)
                horizontalLineToRelative(8.42f)
                curveToRelative(-0.62f, 4.92f, -2.39f, 5.74f, -4.14f, 5.76f)
                close()
                moveTo(7.69f, 15.24f)
                curveToRelative(-0.08f, -0.95f, -0.12f, -2.02f, -0.12f, -3.24f)
                reflectiveCurveToRelative(0.04f, -2.3f, 0.12f, -3.24f)
                horizontalLineToRelative(8.62f)
                curveToRelative(0.08f, 0.95f, 0.12f, 2.02f, 0.12f, 3.24f)
                reflectiveCurveToRelative(-0.04f, 2.3f, -0.12f, 3.24f)
                lineTo(7.69f, 15.24f)
                close()
                moveTo(2.03f, 12.0f)
                curveToRelative(0f, -1.2f, 0.08f, -2.28f, 0.25f, -3.24f)
                lineTo(6.68f, 8.76f)
                curveToRelative(-0.08f, 0.98f, -0.12f, 2.06f, -0.12f, 3.24f)
                reflectiveCurveToRelative(0.04f, 2.26f, 0.12f, 3.24f)
                lineTo(2.28f, 15.24f)
                curveToRelative(-0.17f, -0.96f, -0.25f, -2.04f, -0.25f, -3.24f)
                close()
                moveTo(11.94f, 2f)
                curveToRelative(0.02f, 0f, 0.11f, 0f, 0.13f, 0f)
                curveToRelative(1.75f, 0.02f, 3.53f, 0.84f, 4.14f, 5.76f)
                lineTo(7.79f, 7.76f)
                curveToRelative(0.62f, -4.92f, 2.39f, -5.74f, 4.14f, -5.76f)
                close()
                moveTo(17.32f, 8.76f)
                horizontalLineToRelative(4.4f)
                curveToRelative(0.17f, 0.96f, 0.25f, 2.04f, 0.25f, 3.24f)
                reflectiveCurveToRelative(-0.08f, 2.28f, -0.25f, 3.24f)
                horizontalLineToRelative(-4.4f)
                curveToRelative(0.08f, -0.98f, 0.12f, -2.06f, 0.12f, -3.24f)
                reflectiveCurveToRelative(-0.04f, -2.26f, -0.12f, -3.24f)
                close()
                moveTo(21.5f, 7.76f)
                horizontalLineToRelative(-4.28f)
                curveToRelative(-0.31f, -2.62f, -0.96f, -4.43f, -2.0f, -5.51f)
                curveToRelative(3.44f, 0.61f, 5.45f, 2.35f, 6.29f, 5.51f)
                close()
                moveTo(8.79f, 2.25f)
                curveToRelative(-1.04f, 1.08f, -1.7f, 2.88f, -2.0f, 5.51f)
                lineTo(2.5f, 7.76f)
                curveToRelative(0.84f, -3.16f, 2.84f, -4.9f, 6.29f, -5.51f)
                close()
                moveTo(2.5f, 16.24f)
                lineTo(6.78f, 16.24f)
                curveToRelative(0.31f, 2.62f, 0.96f, 4.43f, 2.0f, 5.51f)
                curveToRelative(-3.44f, -0.61f, -5.45f, -2.35f, -6.29f, -5.51f)
                close()
                moveTo(15.21f, 21.75f)
                curveToRelative(1.04f, -1.08f, 1.7f, -2.88f, 2.0f, -5.51f)
                horizontalLineToRelative(4.28f)
                curveToRelative(-0.84f, 3.16f, -2.84f, 4.9f, -6.29f, 5.51f)
                close()
            }
        }.also { _Globe = it}
