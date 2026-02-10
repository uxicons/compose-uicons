package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSuitcase: ImageVector? = null

val Icons.Ss.UserSuitcase: ImageVector
    get() = _UserSuitcase ?: UXIcon(name = "UserSuitcase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18f, 9.56f)
                lineToRelative(-1.41f, 6f)
                lineToRelative(3.41f, 1.85f)
                verticalLineToRelative(6.58f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.42f)
                lineToRelative(-4.48f, -2.55f)
                curveToRelative(-1.15f, -0.65f, -1.74f, -2.01f, -1.44f, -3.29f)
                lineToRelative(1.02f, -4.38f)
                lineToRelative(-3.03f, 1.67f)
                lineToRelative(-0.98f, 1.91f)
                lineToRelative(-1.78f, -0.91f)
                lineToRelative(1.26f, -2.45f)
                lineToRelative(4.67f, -2.58f)
                horizontalLineToRelative(3.26f)
                curveToRelative(0.86f, 0f, 1.69f, 0.37f, 2.26f, 1.02f)
                lineToRelative(2.34f, 3.7f)
                lineToRelative(2.9f, 1.41f)
                lineToRelative(-0.88f, 1.8f)
                lineToRelative(-3.42f, -1.66f)
                lineToRelative(-1.71f, -2.71f)
                close()
                moveTo(12.02f, 17.13f)
                lineToRelative(-0.46f, 2.0f)
                lineToRelative(-2.27f, 4.87f)
                horizontalLineToRelative(2.2f)
                lineToRelative(1.92f, -4.09f)
                lineToRelative(0.39f, -1.69f)
                lineToRelative(-1.03f, -0.58f)
                curveToRelative(-0.26f, -0.15f, -0.51f, -0.32f, -0.75f, -0.51f)
                close()
                moveTo(10.18f, 17.65f)
                lineToRelative(-2.02f, 4.08f)
                lineTo(0f, 17.81f)
                lineToRelative(2.02f, -4.08f)
                curveToRelative(0.36f, -0.75f, 1.25f, -1.06f, 2.0f, -0.7f)
                lineToRelative(0.55f, 0.26f)
                lineToRelative(0.02f, -0.05f)
                curveToRelative(0.35f, -0.76f, 1.25f, -1.08f, 2.0f, -0.72f)
                lineToRelative(1.58f, 0.75f)
                curveToRelative(0.74f, 0.35f, 1.06f, 1.24f, 0.72f, 1.99f)
                lineToRelative(-0.04f, 0.08f)
                lineToRelative(0.63f, 0.3f)
                curveToRelative(0.75f, 0.36f, 1.06f, 1.25f, 0.7f, 2.0f)
                close()
            }
        }.also { _UserSuitcase = it}
