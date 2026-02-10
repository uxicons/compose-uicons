package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Disk: ImageVector? = null

val Icons.Rc.Disk: ImageVector
    get() = _Disk ?: UXIcon(name = "Disk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10.06f)
                curveToRelative(-2.84f, 0f, -4.28f, 1.44f, -4.28f, 4.28f)
                reflectiveCurveToRelative(1.44f, 4.28f, 4.28f, 4.28f)
                reflectiveCurveToRelative(4.28f, -1.44f, 4.28f, -4.28f)
                reflectiveCurveToRelative(-1.44f, -4.28f, -4.28f, -4.28f)
                close()
                moveTo(12f, 16.61f)
                curveToRelative(-1.54f, 0f, -2.28f, -0.34f, -2.28f, -2.27f)
                reflectiveCurveToRelative(0.73f, -2.28f, 2.28f, -2.28f)
                reflectiveCurveToRelative(2.28f, 0.34f, 2.28f, 2.28f)
                reflectiveCurveToRelative(-0.73f, 2.27f, -2.28f, 2.27f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.42f, 5.55f)
                curveToRelative(-0.04f, -0.2f, -0.13f, -0.39f, -0.28f, -0.53f)
                lineToRelative(-3.14f, -3.14f)
                curveToRelative(-0.14f, -0.14f, -0.33f, -0.24f, -0.53f, -0.28f)
                curveToRelative(-1.54f, -0.28f, -3.91f, -0.6f, -6.47f, -0.6f)
                curveTo(7.16f, 1f, 3.05f, 2.14f, 2.88f, 2.19f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.01f, -1.19f, 9.14f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -2.15f, -0.2f, -4.31f, -0.58f, -6.45f)
                close()
                moveTo(16.03f, 3.26f)
                verticalLineToRelative(2.19f)
                curveToRelative(-0.57f, 0.22f, -1.79f, 0.55f, -4.03f, 0.55f)
                curveToRelative(-2.29f, 0f, -3.5f, -0.33f, -4.03f, -0.53f)
                lineTo(7.97f, 3.26f)
                curveToRelative(1.22f, -0.15f, 2.6f, -0.26f, 4.03f, -0.26f)
                curveToRelative(1.45f, 0f, 2.84f, 0.11f, 4.03f, 0.26f)
                close()
                moveTo(20.04f, 20.02f)
                curveToRelative(-1.24f, 0.3f, -4.47f, 0.98f, -8.04f, 0.98f)
                reflectiveCurveToRelative(-6.8f, -0.68f, -8.04f, -0.98f)
                curveToRelative(-0.3f, -1.19f, -0.96f, -4.23f, -0.96f, -8.02f)
                curveToRelative(0f, -3.75f, 0.67f, -6.83f, 0.96f, -8.02f)
                curveToRelative(0.44f, -0.11f, 1.14f, -0.26f, 2.0f, -0.41f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.29f, 0.12f, 0.56f, 0.34f, 0.75f)
                curveToRelative(0.23f, 0.2f, 1.56f, 1.18f, 5.69f, 1.18f)
                curveToRelative(4.02f, 0f, 5.42f, -0.96f, 5.66f, -1.16f)
                curveToRelative(0.23f, -0.19f, 0.37f, -0.48f, 0.37f, -0.78f)
                lineTo(18.03f, 3.74f)
                lineToRelative(2.47f, 2.47f)
                curveToRelative(0.24f, 1.39f, 0.49f, 3.44f, 0.49f, 5.79f)
                curveToRelative(0f, 3.75f, -0.67f, 6.83f, -0.96f, 8.02f)
                close()
            }
        }.also { _Disk = it}
