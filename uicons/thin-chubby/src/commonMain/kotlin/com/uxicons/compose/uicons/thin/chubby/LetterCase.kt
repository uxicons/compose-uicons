package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LetterCase: ImageVector? = null

val Icons.Tc.LetterCase: ImageVector
    get() = _LetterCase ?: UXIcon(name = "LetterCase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.94f, 5.17f)
                curveToRelative(-0.18f, -0.14f, -0.43f, -0.14f, -0.61f, -0.01f)
                curveToRelative(-0.15f, 0.11f, -3.66f, 2.84f, -6.31f, 13.16f)
                curveToRelative(-0.07f, 0.27f, 0.09f, 0.54f, 0.36f, 0.61f)
                curveToRelative(0.27f, 0.07f, 0.54f, -0.09f, 0.61f, -0.36f)
                curveToRelative(0.35f, -1.36f, 0.71f, -2.58f, 1.08f, -3.68f)
                horizontalLineTo(12.18f)
                curveToRelative(0.37f, 1.1f, 0.73f, 2.32f, 1.08f, 3.68f)
                curveToRelative(0.06f, 0.23f, 0.26f, 0.38f, 0.48f, 0.38f)
                curveToRelative(0.04f, 0f, 0.08f, -0.01f, 0.12f, -0.02f)
                curveToRelative(0.27f, -0.07f, 0.43f, -0.34f, 0.36f, -0.61f)
                curveToRelative(-2.57f, -10.0f, -5.92f, -12.86f, -6.3f, -13.15f)
                close()
                moveTo(3.42f, 13.88f)
                curveToRelative(1.75f, -4.83f, 3.51f, -6.95f, 4.21f, -7.65f)
                curveToRelative(0.69f, 0.69f, 2.46f, 2.82f, 4.21f, 7.65f)
                horizontalLineTo(3.42f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 11.95f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.2f)
                curveToRelative(-0.69f, -0.59f, -1.62f, -0.7f, -2.42f, -0.7f)
                curveToRelative(-1.47f, 0f, -3.41f, 0.36f, -3.41f, 3.5f)
                reflectiveCurveToRelative(1.95f, 3.5f, 3.41f, 3.5f)
                curveToRelative(0.79f, 0f, 1.73f, -0.11f, 2.42f, -0.7f)
                verticalLineToRelative(0.2f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5.99f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(19.59f, 17.94f)
                curveToRelative(-1.49f, 0f, -2.41f, -0.42f, -2.41f, -2.5f)
                reflectiveCurveToRelative(0.89f, -2.5f, 2.41f, -2.5f)
                curveToRelative(1.49f, 0f, 2.42f, 0.42f, 2.42f, 2.5f)
                reflectiveCurveToRelative(-0.89f, 2.5f, -2.42f, 2.5f)
                close()
            }
        }.also { _LetterCase = it}
