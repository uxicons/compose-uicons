package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eyeliner: ImageVector? = null

val Icons.Bs.Eyeliner: ImageVector
    get() = _Eyeliner ?: UXIcon(name = "Eyeliner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.19f, 5.52f)
                lineToRelative(2.27f, 1.96f)
                curveToRelative(-0.06f, 0.07f, -0.84f, 0.96f, -2.23f, 1.82f)
                lineToRelative(0.87f, 1.41f)
                lineToRelative(-2.55f, 1.58f)
                lineToRelative(-1.08f, -1.75f)
                curveToRelative(-0.51f, 0.15f, -1.06f, 0.27f, -1.64f, 0.35f)
                verticalLineToRelative(2.11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.11f)
                curveToRelative(-0.58f, -0.08f, -1.13f, -0.2f, -1.64f, -0.35f)
                lineToRelative(-1.08f, 1.75f)
                lineToRelative(-2.55f, -1.58f)
                lineToRelative(0.87f, -1.41f)
                curveToRelative(-1.4f, -0.87f, -2.17f, -1.75f, -2.23f, -1.82f)
                lineToRelative(2.27f, -1.96f)
                curveToRelative(0.09f, 0.1f, 2.23f, 2.48f, 5.87f, 2.48f)
                reflectiveCurveToRelative(5.78f, -2.38f, 5.87f, -2.48f)
                close()
                moveTo(14.82f, 0f)
                curveToRelative(-2.11f, 0f, -3.57f, 1.24f, -4.17f, 2.06f)
                curveToRelative(-0.17f, 0.17f, -1.02f, 0.94f, -2.33f, 0.94f)
                curveToRelative(-1.46f, 0f, -2.34f, -0.95f, -2.37f, -0.99f)
                lineToRelative(-2.27f, 1.97f)
                curveToRelative(0.18f, 0.21f, 1.82f, 2.02f, 4.64f, 2.02f)
                reflectiveCurveToRelative(4.46f, -1.82f, 4.64f, -2.02f)
                curveToRelative(0.18f, -0.19f, 0.56f, -0.92f, 1.86f, -0.98f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                close()
                moveTo(21.32f, 5f)
                lineTo(19.67f, 7.44f)
                curveToRelative(-0.56f, 0.83f, -0.85f, 1.8f, -0.85f, 2.79f)
                verticalLineToRelative(11.26f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-11.26f)
                curveToRelative(0f, -0.99f, -0.3f, -1.97f, -0.85f, -2.79f)
                close()
            }
        }.also { _Eyeliner = it}
