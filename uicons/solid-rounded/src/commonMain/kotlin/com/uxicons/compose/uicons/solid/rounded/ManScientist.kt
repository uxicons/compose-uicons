package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManScientist: ImageVector? = null

val Icons.Sr.ManScientist: ImageVector
    get() = _ManScientist ?: UXIcon(name = "ManScientist") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(23.38f, 20.02f)
                curveToRelative(-0.01f, -0.01f, -0.01f, -0.02f, -0.02f, -0.02f)
                lineToRelative(-3.36f, -3.48f)
                verticalLineToRelative(-2.51f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(2.51f)
                lineToRelative(-3.46f, 3.59f)
                curveToRelative(-0.59f, 0.72f, -0.71f, 1.69f, -0.31f, 2.53f)
                curveToRelative(0.4f, 0.84f, 1.23f, 1.37f, 2.16f, 1.37f)
                horizontalLineToRelative(6.23f)
                curveToRelative(0.96f, 0f, 1.79f, -0.54f, 2.18f, -1.42f)
                curveToRelative(0.39f, -0.87f, 0.23f, -1.86f, -0.41f, -2.56f)
                close()
                moveTo(-0.0f, 22.61f)
                curveToRelative(0f, 1.08f, 0.75f, 1.39f, 1.43f, 1.39f)
                horizontalLineToRelative(10.28f)
                curveToRelative(-0.1f, -0.16f, -0.2f, -0.33f, -0.29f, -0.51f)
                curveToRelative(-0.73f, -1.55f, -0.51f, -3.33f, 0.58f, -4.66f)
                lineToRelative(3.0f, -3.2f)
                reflectiveCurveToRelative(0.01f, -0.25f, -0.05f, -0.53f)
                curveToRelative(-0.07f, -0.35f, -0.38f, -0.62f, -0.46f, -0.69f)
                curveToRelative(-0.65f, -0.55f, -1.61f, -0.48f, -2.17f, 0.16f)
                lineToRelative(-3.31f, 3.62f)
                lineToRelative(-3.38f, -3.66f)
                curveToRelative(-0.52f, -0.59f, -1.42f, -0.71f, -2.05f, -0.24f)
                curveTo(1.87f, 15.55f, -0.0f, 17.45f, -0.0f, 21.92f)
                verticalLineToRelative(0.69f)
                close()
            }
        }.also { _ManScientist = it}
