package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Investor: ImageVector? = null

val Icons.Ss.Investor: ImageVector
    get() = _Investor ?: UXIcon(name = "Investor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.38f, -0.27f, -0.7f, -0.64f, -0.76f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-1.34f, -0.22f, -2.31f, -1.37f, -2.31f, -2.73f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.38f, 0.27f, 0.7f, 0.64f, 0.76f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(1.34f, 0.22f, 2.31f, 1.37f, 2.31f, 2.73f)
                close()
                moveTo(19f, 5.95f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.05f)
                lineToRelative(1.57f, 1.57f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.48f, -2.48f)
                curveToRelative(-0.83f, -0.83f, -2.18f, -0.83f, -3.01f, 0f)
                lineToRelative(-2.5f, 2.5f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(14f, 20f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.68f, 0.14f, -1.32f, 0.38f, -1.91f)
                curveToRelative(-0.29f, -0.06f, -0.58f, -0.09f, -0.88f, -0.09f)
                horizontalLineToRelative(-9f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(16.03f)
                curveToRelative(-1.23f, -0.91f, -2.03f, -2.36f, -2.03f, -4f)
                close()
            }
        }.also { _Investor = it}
