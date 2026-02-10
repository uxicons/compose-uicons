package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FighterJet: ImageVector? = null

val Icons.Sc.FighterJet: ImageVector
    get() = _FighterJet ?: UXIcon(name = "FighterJet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.74f, 15.88f)
                curveToRelative(2.54f, -0.4f, 6.26f, -1.58f, 6.26f, -3.88f)
                reflectiveCurveToRelative(-3.72f, -3.48f, -6.26f, -3.88f)
                curveToRelative(-0.68f, -1.22f, -1.42f, -2.26f, -2.43f, -3.12f)
                horizontalLineToRelative(1.6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(0f, 0f, -5.67f, 0.0f, -5.68f, 0.0f)
                curveToRelative(-0.31f, 0.02f, -0.6f, 0.17f, -0.78f, 0.44f)
                curveToRelative(-0.06f, 0.08f, -1.3f, 1.95f, -1.89f, 5.42f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-0.77f, -1.07f, -1.73f, -1.74f, -3.11f, -2.17f)
                curveToRelative(-0.36f, -0.11f, -0.75f, -0.01f, -1.02f, 0.26f)
                curveToRelative(-0.07f, 0.08f, -1.83f, 1.92f, -1.83f, 5.04f)
                curveToRelative(0f, 3.16f, 1.76f, 4.97f, 1.84f, 5.05f)
                curveToRelative(0.26f, 0.27f, 0.65f, 0.36f, 1.01f, 0.25f)
                curveToRelative(1.39f, -0.43f, 2.34f, -1.1f, 3.11f, -2.17f)
                horizontalLineToRelative(0.61f)
                curveToRelative(0.59f, 3.47f, 1.84f, 5.34f, 1.89f, 5.42f)
                curveToRelative(0.18f, 0.27f, 0.47f, 0.42f, 0.78f, 0.44f)
                curveToRelative(0.01f, 0f, 5.67f, 0.0f, 5.67f, 0.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(1.01f, -0.86f, 1.76f, -1.9f, 2.43f, -3.12f)
                close()
            }
        }.also { _FighterJet = it}
