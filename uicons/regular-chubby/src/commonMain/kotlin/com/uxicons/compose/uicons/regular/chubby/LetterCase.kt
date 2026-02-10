package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LetterCase: ImageVector? = null

val Icons.Rc.LetterCase: ImageVector
    get() = _LetterCase ?: UXIcon(name = "LetterCase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.45f, 5.1f)
                curveToRelative(-0.35f, -0.28f, -0.85f, -0.28f, -1.22f, -0.01f)
                curveToRelative(-0.15f, 0.11f, -3.63f, 2.81f, -6.2f, 12.78f)
                curveToRelative(-0.14f, 0.54f, 0.18f, 1.08f, 0.72f, 1.22f)
                curveToRelative(0.54f, 0.14f, 1.08f, -0.18f, 1.22f, -0.72f)
                curveToRelative(0.29f, -1.13f, 0.6f, -2.16f, 0.9f, -3.1f)
                horizontalLineToRelative(7.92f)
                curveToRelative(0.31f, 0.94f, 0.61f, 1.97f, 0.9f, 3.1f)
                curveToRelative(0.12f, 0.45f, 0.52f, 0.75f, 0.97f, 0.75f)
                curveToRelative(0.08f, 0f, 0.17f, -0.01f, 0.25f, -0.03f)
                curveToRelative(0.54f, -0.14f, 0.86f, -0.68f, 0.72f, -1.22f)
                curveToRelative(-2.49f, -9.66f, -5.81f, -12.47f, -6.18f, -12.76f)
                close()
                moveTo(4.58f, 13.26f)
                curveToRelative(1.28f, -3.31f, 2.53f, -5.1f, 3.25f, -5.95f)
                curveToRelative(0.71f, 0.84f, 1.97f, 2.64f, 3.25f, 5.95f)
                lineTo(4.58f, 13.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11.43f)
                curveToRelative(-0.32f, 0f, -0.6f, 0.15f, -0.79f, 0.38f)
                curveToRelative(-0.54f, -0.25f, -1.21f, -0.38f, -1.99f, -0.38f)
                curveToRelative(-2.51f, 0f, -3.78f, 1.29f, -3.78f, 3.84f)
                reflectiveCurveToRelative(1.27f, 3.84f, 3.78f, 3.84f)
                curveToRelative(0.79f, 0f, 1.45f, -0.13f, 1.99f, -0.38f)
                curveToRelative(0.18f, 0.23f, 0.47f, 0.38f, 0.79f, 0.38f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.68f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(19.23f, 17.11f)
                curveToRelative(-1.25f, 0f, -1.78f, -0.26f, -1.78f, -1.84f)
                reflectiveCurveToRelative(0.52f, -1.84f, 1.78f, -1.84f)
                reflectiveCurveToRelative(1.77f, 0.26f, 1.77f, 1.84f)
                reflectiveCurveToRelative(-0.52f, 1.84f, -1.77f, 1.84f)
                close()
            }
        }.also { _LetterCase = it}
