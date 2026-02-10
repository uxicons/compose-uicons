package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Tr.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(9f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(15f, 8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(15f, 11f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(12f, 0f)
                curveTo(6.49f, 0f, 2f, 4.49f, 2f, 10f)
                verticalLineToRelative(13.5f)
                curveToRelative(0f, 0.23f, 0.17f, 0.5f, 0.5f, 0.5f)
                curveToRelative(0.19f, 0f, 0.37f, -0.11f, 0.45f, -0.29f)
                curveToRelative(0.48f, -1.02f, 1.57f, -1.71f, 2.71f, -1.71f)
                curveToRelative(1.1f, 0f, 2.15f, 0.67f, 2.73f, 1.74f)
                curveToRelative(0.09f, 0.16f, 0.26f, 0.26f, 0.44f, 0.26f)
                horizontalLineToRelative(0f)
                curveToRelative(0.18f, 0f, 0.35f, -0.1f, 0.44f, -0.26f)
                curveToRelative(0.57f, -1.07f, 1.62f, -1.74f, 2.73f, -1.74f)
                curveToRelative(1.09f, 0f, 2.21f, 0.71f, 2.72f, 1.72f)
                curveToRelative(0.09f, 0.17f, 0.26f, 0.28f, 0.46f, 0.28f)
                curveToRelative(0.2f, -0.01f, 0.37f, -0.12f, 0.45f, -0.3f)
                curveToRelative(0.41f, -0.97f, 1.58f, -1.7f, 2.71f, -1.7f)
                curveToRelative(1.26f, 0f, 2.27f, 0.87f, 2.72f, 1.73f)
                curveToRelative(0.11f, 0.2f, 0.34f, 0.31f, 0.56f, 0.25f)
                curveToRelative(0.22f, -0.06f, 0.38f, -0.26f, 0.38f, -0.48f)
                verticalLineToRelative(-13.5f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                close()
                moveTo(21f, 22.07f)
                curveToRelative(-0.69f, -0.62f, -1.61f, -1.07f, -2.67f, -1.07f)
                curveToRelative(-1.23f, 0f, -2.45f, 0.62f, -3.18f, 1.56f)
                curveToRelative(-0.77f, -0.95f, -1.95f, -1.56f, -3.15f, -1.56f)
                curveToRelative(-1.22f, 0f, -2.38f, 0.59f, -3.17f, 1.59f)
                curveToRelative(-0.79f, -1.0f, -1.95f, -1.59f, -3.17f, -1.59f)
                curveToRelative(-0.98f, 0f, -1.94f, 0.39f, -2.67f, 1.03f)
                verticalLineToRelative(-12.03f)
                curveTo(3f, 5.04f, 7.04f, 1f, 12f, 1f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(12.07f)
                close()
            }
        }.also { _Ghost = it}
