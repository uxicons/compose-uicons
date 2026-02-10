package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimneyCrack: ImageVector? = null

val Icons.Sr.HouseChimneyCrack: ImageVector
    get() = _HouseChimneyCrack ?: UXIcon(name = "HouseChimneyCrack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 5.73f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.37f)
                lineTo(14.8f, 0.85f)
                curveToRelative(-1.69f, -1.14f, -3.9f, -1.14f, -5.59f, 0f)
                lineTo(2.2f, 5.58f)
                curveToRelative(-1.38f, 0.93f, -2.2f, 2.48f, -2.2f, 4.15f)
                verticalLineToRelative(9.28f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(3.17f)
                curveToRelative(0.62f, 0f, 1.18f, -0.38f, 1.4f, -0.96f)
                lineToRelative(1.56f, -4.04f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-1.09f, 0f, -1.74f, -1.2f, -1.15f, -2.11f)
                lineToRelative(4.95f, -7.36f)
                curveToRelative(0.21f, -0.33f, 0.58f, -0.53f, 0.97f, -0.53f)
                curveToRelative(0.78f, 0f, 1.34f, 0.76f, 1.11f, 1.5f)
                lineToRelative(-1.37f, 4.5f)
                horizontalLineToRelative(2.87f)
                curveToRelative(0.84f, 0f, 1.44f, 0.83f, 1.16f, 1.63f)
                lineToRelative(-2.03f, 6.05f)
                curveToRelative(-0.22f, 0.65f, 0.27f, 1.32f, 0.95f, 1.32f)
                horizontalLineToRelative(3.15f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineTo(9.72f)
                curveToRelative(0f, -1.58f, -0.75f, -3.05f, -2f, -3.99f)
                close()
            }
        }.also { _HouseChimneyCrack = it}
