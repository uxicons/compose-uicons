package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ContactLensEyes: ImageVector? = null

val Icons.Sr.ContactLensEyes: ImageVector
    get() = _ContactLensEyes ?: UXIcon(name = "ContactLensEyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 23f)
                curveToRelative(-0.19f, 0f, -0.38f, -0.05f, -0.55f, -0.17f)
                curveToRelative(-0.46f, -0.3f, -0.59f, -0.93f, -0.28f, -1.39f)
                curveToRelative(0.02f, -0.03f, 2.33f, -3.65f, 2.33f, -9.45f)
                reflectiveCurveToRelative(-2.31f, -9.42f, -2.34f, -9.45f)
                curveToRelative(-0.3f, -0.46f, -0.17f, -1.08f, 0.29f, -1.38f)
                curveToRelative(0.46f, -0.3f, 1.08f, -0.18f, 1.38f, 0.28f)
                curveToRelative(0.11f, 0.17f, 2.67f, 4.11f, 2.67f, 10.55f)
                reflectiveCurveToRelative(-2.56f, 10.39f, -2.67f, 10.55f)
                curveToRelative(-0.19f, 0.29f, -0.51f, 0.45f, -0.84f, 0.45f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, 2.45f, 1.97f, 4.44f, 4.41f, 4.49f)
                curveToRelative(0.17f, -0.63f, 0.3f, -1.31f, 0.41f, -2.02f)
                curveToRelative(-0.1f, 0.01f, -0.21f, 0.03f, -0.32f, 0.03f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.11f, 0f, 0.21f, 0.02f, 0.32f, 0.03f)
                curveToRelative(-0.1f, -0.72f, -0.24f, -1.39f, -0.41f, -2.02f)
                curveToRelative(-2.44f, 0.05f, -4.41f, 2.04f, -4.41f, 4.49f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, -3.34f, 2.53f, -6.1f, 5.78f, -6.46f)
                curveToRelative(-0.17f, -0.44f, -0.34f, -0.85f, -0.51f, -1.21f)
                curveToRelative(-0.8f, -1.72f, -2.67f, -2.65f, -4.54f, -2.25f)
                curveTo(8.43f, 3.21f, 3.52f, 6.85f, 0.93f, 9.63f)
                curveToRelative(-1.24f, 1.33f, -1.24f, 3.41f, 0f, 4.74f)
                curveToRelative(2.59f, 2.78f, 7.49f, 6.42f, 12.79f, 7.54f)
                curveToRelative(0.29f, 0.06f, 0.58f, 0.09f, 0.87f, 0.09f)
                curveToRelative(1.56f, 0f, 3.0f, -0.89f, 3.68f, -2.34f)
                curveToRelative(0.17f, -0.36f, 0.34f, -0.77f, 0.51f, -1.21f)
                curveToRelative(-3.24f, -0.36f, -5.78f, -3.12f, -5.78f, -6.46f)
                close()
            }
        }.also { _ContactLensEyes = it}
