package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LetterCase: ImageVector? = null

val Icons.Sc.LetterCase: ImageVector
    get() = _LetterCase ?: UXIcon(name = "LetterCase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.62f, 5.45f)
                curveToRelative(-0.53f, -0.41f, -1.26f, -0.41f, -1.8f, -0.02f)
                curveToRelative(-0.35f, 0.26f, -3.45f, 2.75f, -5.76f, 11.55f)
                curveToRelative(-0.21f, 0.8f, 0.27f, 1.62f, 1.07f, 1.83f)
                curveToRelative(0.8f, 0.21f, 1.62f, -0.27f, 1.83f, -1.07f)
                curveToRelative(0.21f, -0.81f, 0.43f, -1.56f, 0.66f, -2.26f)
                horizontalLineToRelative(6.19f)
                curveToRelative(0.22f, 0.69f, 0.44f, 1.45f, 0.66f, 2.26f)
                curveToRelative(0.18f, 0.67f, 0.78f, 1.12f, 1.45f, 1.12f)
                curveToRelative(0.13f, 0f, 0.25f, -0.02f, 0.38f, -0.05f)
                curveToRelative(0.8f, -0.21f, 1.28f, -1.03f, 1.07f, -1.83f)
                curveToRelative(-2.28f, -8.68f, -5.39f, -11.27f, -5.74f, -11.54f)
                close()
                moveTo(5.72f, 12.48f)
                curveToRelative(0.75f, -1.73f, 1.45f, -2.88f, 1.98f, -3.6f)
                curveToRelative(0.53f, 0.72f, 1.24f, 1.88f, 1.98f, 3.6f)
                horizontalLineToRelative(-3.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 10.88f)
                curveToRelative(-0.3f, 0f, -0.58f, 0.09f, -0.82f, 0.24f)
                curveToRelative(-0.46f, -0.15f, -1.01f, -0.24f, -1.66f, -0.24f)
                curveToRelative(-3.46f, 0f, -3.98f, 2.5f, -3.98f, 3.99f)
                reflectiveCurveToRelative(0.52f, 3.99f, 3.98f, 3.99f)
                curveToRelative(0.65f, 0f, 1.2f, -0.09f, 1.66f, -0.24f)
                curveToRelative(0.23f, 0.15f, 0.52f, 0.24f, 0.82f, 0.24f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-4.99f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(19.02f, 16.37f)
                curveToRelative(-1.33f, 0f, -1.5f, -0.06f, -1.5f, -1.5f)
                curveToRelative(0f, -1.5f, 0.2f, -1.5f, 1.5f, -1.5f)
                curveToRelative(1.33f, 0f, 1.5f, 0.06f, 1.5f, 1.5f)
                curveToRelative(0f, 1.5f, -0.2f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _LetterCase = it}
