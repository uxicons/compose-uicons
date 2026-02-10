package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Burnout: ImageVector? = null

val Icons.Sr.Burnout: ImageVector
    get() = _Burnout ?: UXIcon(name = "Burnout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(15f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-0.18f)
                curveToRelative(-0.41f, -1.16f, -1.51f, -2f, -2.82f, -2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
                horizontalLineToRelative(0.18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(10.02f, 15.92f)
                curveToRelative(0.03f, -0.64f, 0.1f, -1.25f, 0.23f, -1.83f)
                curveToRelative(-0.41f, -0.06f, -0.82f, -0.09f, -1.25f, -0.09f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10.03f)
                curveToRelative(-0.64f, -0.84f, -1.03f, -1.87f, -1.03f, -3f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(5f)
                curveToRelative(1.6f, 0f, 3.07f, 0.78f, 4f, 2.04f)
                verticalLineToRelative(-0.54f)
                curveToRelative(0f, -3.43f, -3.12f, -6.06f, -5.29f, -8.21f)
                curveToRelative(-0.49f, -0.49f, -1.34f, -0.34f, -1.6f, 0.31f)
                curveToRelative(-0.97f, 2.38f, -0.22f, 4.91f, -1.51f, 4.91f)
                curveToRelative(-0.52f, 0f, -0.86f, -0.29f, -1.17f, -1.13f)
                curveToRelative(-0.21f, -0.57f, -0.98f, -0.64f, -1.29f, -0.13f)
                curveToRelative(-0.23f, 0.37f, -0.44f, 0.73f, -0.52f, 0.92f)
                curveToRelative(-0.38f, 0.9f, -0.56f, 1.88f, -0.6f, 2.86f)
                curveToRelative(0.83f, -0.62f, 1.86f, -1.01f, 2.98f, -1.01f)
                close()
            }
        }.also { _Burnout = it}
