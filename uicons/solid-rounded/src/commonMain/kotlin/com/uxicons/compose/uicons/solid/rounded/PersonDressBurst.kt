package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDressBurst: ImageVector? = null

val Icons.Sr.PersonDressBurst: ImageVector
    get() = _PersonDressBurst ?: UXIcon(name = "PersonDressBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(23.25f, 18.98f)
                curveToRelative(-0.34f, 0.39f, -0.78f, 0.66f, -1.25f, 0.83f)
                verticalLineToRelative(3.19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.19f)
                curveToRelative(-0.47f, -0.17f, -0.91f, -0.44f, -1.25f, -0.83f)
                curveToRelative(-0.57f, -0.65f, -0.83f, -1.5f, -0.73f, -2.36f)
                lineToRelative(0.88f, -7.01f)
                curveToRelative(0.26f, -2.06f, 2.02f, -3.62f, 4.1f, -3.62f)
                reflectiveCurveToRelative(3.84f, 1.56f, 4.1f, 3.62f)
                lineToRelative(0.88f, 7.01f)
                curveToRelative(0.11f, 0.85f, -0.16f, 1.71f, -0.73f, 2.36f)
                close()
                moveTo(12.04f, 16.38f)
                lineToRelative(0.88f, -7.01f)
                curveToRelative(0.18f, -1.49f, 0.9f, -2.79f, 1.94f, -3.75f)
                lineTo(12.0f, 0.95f)
                curveToRelative(-0.61f, -1.25f, -2.55f, -1.25f, -3.16f, 0.0f)
                lineToRelative(-1.28f, 2.4f)
                lineTo(3.17f, 1.06f)
                curveTo(1.82f, 0.29f, 0.25f, 1.95f, 1.12f, 3.28f)
                lineToRelative(2.66f, 3.98f)
                lineToRelative(-2.91f, 1.34f)
                curveToRelative(-1.18f, 0.54f, -1.14f, 2.35f, 0.08f, 2.84f)
                lineToRelative(2.85f, 1.18f)
                reflectiveCurveToRelative(-1.5f, 2.96f, -1.52f, 2.99f)
                curveToRelative(-0.51f, 1.26f, 0.82f, 2.61f, 2.1f, 2.11f)
                lineToRelative(3.18f, -1.2f)
                lineToRelative(1.36f, 2.54f)
                curveToRelative(0.74f, 1.45f, 2.91f, 1.11f, 3.37f, -0.39f)
                curveToRelative(-0.26f, -0.72f, -0.35f, -1.5f, -0.25f, -2.28f)
                close()
            }
        }.also { _PersonDressBurst = it}
