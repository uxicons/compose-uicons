package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPlumber: ImageVector? = null

val Icons.Sr.UserPlumber: ImageVector
    get() = _UserPlumber ?: UXIcon(name = "UserPlumber") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.0f, 9f)
                horizontalLineToRelative(12f)
                curveToRelative(0.01f, 3.29f, -2.69f, 6.0f, -6f, 6f)
                curveToRelative(-3.26f, 0f, -6f, -2.5f, -6f, -6f)
                close()
                moveTo(2.0f, 7f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.24f, -2.63f, -2.34f, -4.74f, -4.98f, -4.98f)
                verticalLineToRelative(2.98f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2.98f)
                curveToRelative(-2.63f, 0.24f, -4.74f, 2.34f, -4.98f, 4.98f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(15f, 21.32f)
                curveToRelative(-1.46f, -1.02f, -2.47f, -2.55f, -2.84f, -4.29f)
                curveToRelative(-1.16f, -0.65f, -2.55f, -1.03f, -4.16f, -1.03f)
                curveToRelative(-4.71f, 0f, -7.58f, 3.23f, -7.99f, 6.88f)
                curveToRelative(-0.08f, 0.58f, 0.41f, 1.14f, 0.99f, 1.12f)
                horizontalLineToRelative(14.35f)
                curveToRelative(-0.22f, -0.46f, -0.35f, -0.96f, -0.35f, -1.5f)
                close()
                moveTo(22.31f, 11.84f)
                curveToRelative(-0.51f, -0.45f, -1.31f, -0.06f, -1.31f, 0.61f)
                verticalLineToRelative(1.44f)
                curveToRelative(0f, 1.0f, -0.68f, 1.92f, -1.66f, 2.08f)
                curveToRelative(-1.25f, 0.21f, -2.34f, -0.76f, -2.34f, -1.97f)
                verticalLineToRelative(-1.55f)
                curveToRelative(0f, -0.68f, -0.8f, -1.06f, -1.31f, -0.61f)
                curveToRelative(-1.04f, 0.92f, -1.69f, 2.25f, -1.69f, 3.74f)
                curveToRelative(0f, 2.05f, 1.24f, 3.81f, 3f, 4.58f)
                verticalLineToRelative(2.34f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.34f)
                curveToRelative(1.76f, -0.77f, 3f, -2.53f, 3f, -4.58f)
                curveToRelative(0f, -1.49f, -0.65f, -2.83f, -1.69f, -3.74f)
                close()
            }
        }.also { _UserPlumber = it}
