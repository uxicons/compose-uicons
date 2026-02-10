package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ContactLensEyes: ImageVector? = null

val Icons.Rs.ContactLensEyes: ImageVector
    get() = _ContactLensEyes ?: UXIcon(name = "ContactLensEyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.12f, 2.41f)
                lineToRelative(-0.32f, -0.44f)
                lineToRelative(-0.55f, 0.03f)
                curveTo(7.08f, 2.52f, 0.67f, 11.04f, 0.4f, 11.4f)
                lineToRelative(-0.44f, 0.59f)
                lineToRelative(0.44f, 0.59f)
                curveToRelative(0.27f, 0.36f, 6.68f, 8.88f, 15.86f, 9.4f)
                lineToRelative(0.55f, 0.03f)
                lineToRelative(0.32f, -0.44f)
                curveToRelative(0.12f, -0.16f, 2.88f, -4.03f, 2.88f, -9.59f)
                reflectiveCurveToRelative(-2.76f, -9.43f, -2.88f, -9.59f)
                close()
                moveTo(15.8f, 19.96f)
                curveToRelative(-6.63f, -0.66f, -11.76f, -6.12f, -13.31f, -7.96f)
                curveToRelative(1.55f, -1.83f, 6.68f, -7.29f, 13.31f, -7.96f)
                curveToRelative(0.22f, 0.37f, 0.54f, 0.97f, 0.87f, 1.72f)
                curveToRelative(-2.69f, 0.79f, -4.67f, 3.29f, -4.67f, 6.23f)
                reflectiveCurveToRelative(1.97f, 5.44f, 4.67f, 6.23f)
                curveToRelative(-0.33f, 0.76f, -0.65f, 1.35f, -0.87f, 1.72f)
                close()
                moveTo(17.8f, 14.39f)
                curveToRelative(-0.11f, 0.7f, -0.27f, 1.35f, -0.44f, 1.95f)
                curveToRelative(-1.92f, -0.51f, -3.35f, -2.25f, -3.35f, -4.33f)
                reflectiveCurveToRelative(1.43f, -3.82f, 3.35f, -4.33f)
                curveToRelative(0.18f, 0.6f, 0.33f, 1.25f, 0.44f, 1.95f)
                curveToRelative(-1.03f, 0.31f, -1.79f, 1.25f, -1.79f, 2.39f)
                reflectiveCurveToRelative(0.76f, 2.08f, 1.79f, 2.39f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.42f, -2.69f, 10.89f, -2.8f, 11.08f)
                lineToRelative(-1.71f, -1.04f)
                curveToRelative(0.03f, -0.04f, 2.51f, -4.21f, 2.51f, -10.04f)
                reflectiveCurveToRelative(-2.48f, -10.0f, -2.51f, -10.04f)
                lineToRelative(1.71f, -1.04f)
                curveToRelative(0.11f, 0.19f, 2.8f, 4.66f, 2.8f, 11.08f)
                close()
            }
        }.also { _ContactLensEyes = it}
