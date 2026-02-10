package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ContactLensEyes: ImageVector? = null

val Icons.Ss.ContactLensEyes: ImageVector
    get() = _ContactLensEyes ?: UXIcon(name = "ContactLensEyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.2f, 23.08f)
                lineToRelative(-1.71f, -1.04f)
                curveToRelative(0.03f, -0.04f, 2.51f, -4.21f, 2.51f, -10.04f)
                reflectiveCurveToRelative(-2.48f, -10.0f, -2.51f, -10.04f)
                lineToRelative(1.71f, -1.04f)
                curveToRelative(0.11f, 0.19f, 2.8f, 4.66f, 2.8f, 11.08f)
                reflectiveCurveToRelative(-2.69f, 10.89f, -2.8f, 11.08f)
                close()
                moveTo(15f, 12f)
                curveToRelative(0f, 2.45f, 1.96f, 4.43f, 4.4f, 4.49f)
                curveToRelative(0.17f, -0.63f, 0.31f, -1.3f, 0.41f, -2.02f)
                curveToRelative(-0.1f, 0.01f, -0.21f, 0.03f, -0.31f, 0.03f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(0.11f, 0f, 0.21f, 0.02f, 0.31f, 0.03f)
                curveToRelative(-0.1f, -0.72f, -0.25f, -1.39f, -0.41f, -2.02f)
                curveToRelative(-2.43f, 0.06f, -4.4f, 2.04f, -4.4f, 4.49f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, -3.33f, 2.52f, -6.08f, 5.75f, -6.45f)
                curveToRelative(-0.75f, -1.9f, -1.56f, -3.05f, -1.62f, -3.13f)
                lineToRelative(-0.32f, -0.44f)
                lineToRelative(-0.55f, 0.03f)
                curveTo(7.08f, 2.52f, 0.67f, 11.04f, 0.4f, 11.4f)
                lineToRelative(-0.44f, 0.59f)
                lineToRelative(0.44f, 0.59f)
                curveToRelative(0.27f, 0.36f, 6.68f, 8.88f, 15.86f, 9.4f)
                lineToRelative(0.55f, 0.03f)
                lineToRelative(0.32f, -0.44f)
                curveToRelative(0.06f, -0.09f, 0.88f, -1.24f, 1.62f, -3.13f)
                curveToRelative(-3.23f, -0.37f, -5.75f, -3.12f, -5.75f, -6.45f)
                close()
            }
        }.also { _ContactLensEyes = it}
