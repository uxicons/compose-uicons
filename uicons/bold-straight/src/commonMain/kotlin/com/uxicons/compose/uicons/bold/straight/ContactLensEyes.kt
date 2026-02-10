package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ContactLensEyes: ImageVector? = null

val Icons.Bs.ContactLensEyes: ImageVector
    get() = _ContactLensEyes ?: UXIcon(name = "ContactLensEyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.73f, 1.94f)
                lineToRelative(-0.84f, 0.06f)
                curveTo(6.24f, 2.55f, 0.77f, 10.83f, 0.54f, 11.18f)
                lineTo(0.01f, 12f)
                lineToRelative(0.53f, 0.82f)
                curveToRelative(0.23f, 0.35f, 5.7f, 8.63f, 13.36f, 9.18f)
                lineToRelative(0.84f, 0.06f)
                lineToRelative(0.49f, -0.68f)
                curveToRelative(0.11f, -0.16f, 2.78f, -3.95f, 2.78f, -9.37f)
                reflectiveCurveToRelative(-2.67f, -9.21f, -2.78f, -9.37f)
                lineToRelative(-0.49f, -0.68f)
                close()
                moveTo(3.64f, 12f)
                curveToRelative(1.39f, -1.82f, 5.07f, -6.09f, 9.58f, -6.89f)
                curveToRelative(0.18f, 0.33f, 0.4f, 0.78f, 0.62f, 1.3f)
                curveToRelative(-2.25f, 0.87f, -3.85f, 3.04f, -3.85f, 5.59f)
                reflectiveCurveToRelative(1.6f, 4.72f, 3.84f, 5.59f)
                curveToRelative(-0.22f, 0.53f, -0.44f, 0.97f, -0.62f, 1.3f)
                curveToRelative(-4.51f, -0.8f, -8.19f, -5.08f, -9.58f, -6.89f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, 0.97f, -0.11f, 1.87f, -0.28f, 2.7f)
                curveToRelative(-1.01f, -0.48f, -1.72f, -1.51f, -1.72f, -2.7f)
                reflectiveCurveToRelative(0.71f, -2.22f, 1.72f, -2.71f)
                curveToRelative(0.16f, 0.83f, 0.28f, 1.73f, 0.28f, 2.71f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.56f, -2.76f, 11.15f, -2.87f, 11.34f)
                lineToRelative(-2.56f, -1.56f)
                curveToRelative(0.02f, -0.04f, 2.43f, -4.1f, 2.43f, -9.78f)
                reflectiveCurveToRelative(-2.41f, -9.74f, -2.44f, -9.78f)
                lineToRelative(2.56f, -1.56f)
                curveToRelative(0.12f, 0.19f, 2.87f, 4.78f, 2.87f, 11.34f)
                close()
            }
        }.also { _ContactLensEyes = it}
