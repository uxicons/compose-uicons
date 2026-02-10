package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareInfo: ImageVector? = null

val Icons.Sc.SquareInfo: ImageVector
    get() = _SquareInfo ?: UXIcon(name = "SquareInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 2.79f)
                curveToRelative(-0.07f, -0.34f, -0.33f, -0.62f, -0.66f, -0.73f)
                curveToRelative(-0.13f, -0.04f, -3.22f, -1.05f, -9.32f, -1.05f)
                reflectiveCurveToRelative(-9.19f, 1.01f, -9.32f, 1.05f)
                curveToRelative(-0.33f, 0.11f, -0.58f, 0.39f, -0.66f, 0.73f)
                curveToRelative(-0.04f, 0.19f, -1.02f, 4.71f, -1.02f, 9.21f)
                reflectiveCurveToRelative(0.98f, 9.02f, 1.02f, 9.21f)
                curveToRelative(0.07f, 0.34f, 0.33f, 0.62f, 0.66f, 0.73f)
                curveToRelative(0.13f, 0.04f, 3.22f, 1.05f, 9.32f, 1.05f)
                reflectiveCurveToRelative(9.19f, -1.01f, 9.32f, -1.05f)
                curveToRelative(0.33f, -0.11f, 0.58f, -0.39f, 0.66f, -0.73f)
                curveToRelative(0.04f, -0.19f, 1.02f, -4.71f, 1.02f, -9.21f)
                reflectiveCurveToRelative(-0.98f, -9.02f, -1.02f, -9.21f)
                close()
                moveTo(12f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(14f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5.89f)
                curveToRelative(-0.85f, 0.2f, -1.28f, 0.59f, -1.3f, 0.61f)
                curveToRelative(-0.4f, 0.37f, -1.03f, 0.36f, -1.41f, -0.03f)
                curveToRelative(-0.38f, -0.39f, -0.38f, -1.01f, 0.01f, -1.4f)
                curveToRelative(0.13f, -0.13f, 1.36f, -1.29f, 3.71f, -1.29f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SquareInfo = it}
