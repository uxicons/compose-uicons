package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveArrow: ImageVector? = null

val Icons.Bs.CurveArrow: ImageVector
    get() = _CurveArrow ?: UXIcon(name = "CurveArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.77f, 19.95f)
                lineToRelative(-2.77f, -2.95f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.66f, 0f, -1.73f, -2.03f, -2.31f, -3.12f)
                curveToRelative(-1.06f, -2.0f, -2.07f, -3.88f, -3.94f, -3.88f)
                reflectiveCurveToRelative(-2.87f, 1.89f, -3.94f, 3.88f)
                curveToRelative(-0.58f, 1.09f, -1.72f, 3.12f, -2.37f, 3.12f)
                curveToRelative(0.51f, -1.35f, 0.94f, -3.09f, 1.45f, -5.12f)
                curveToRelative(0.53f, -2.13f, 1.38f, -5.55f, 2.12f, -6.65f)
                curveToRelative(0.4f, 0.56f, 0.85f, 1.72f, 1.27f, 3.01f)
                curveToRelative(0.44f, -0.15f, 0.93f, -0.24f, 1.46f, -0.24f)
                curveToRelative(0.64f, 0f, 1.21f, 0.12f, 1.72f, 0.34f)
                curveToRelative(-1.12f, -3.7f, -2.29f, -6.33f, -4.47f, -6.33f)
                curveToRelative(-2.74f, 0f, -3.75f, 4.04f, -5.02f, 9.15f)
                curveToRelative(-0.41f, 1.63f, -0.97f, 3.9f, -1.48f, 5.15f)
                lineTo(5.0f, 3f)
                horizontalLineToRelative(2f)
                lineTo(4.05f, 0.23f)
                curveToRelative(-0.3f, -0.3f, -0.8f, -0.3f, -1.1f, 0f)
                lineTo(0f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(2f)
                lineToRelative(2.77f, -2.95f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.8f, 0f, -1.1f)
                close()
                moveTo(12.01f, 19f)
                curveToRelative(0.34f, -0.56f, 0.65f, -1.14f, 0.95f, -1.71f)
                curveToRelative(0.35f, -0.66f, 0.9f, -1.7f, 1.29f, -2.15f)
                curveToRelative(0.38f, 0.45f, 0.94f, 1.48f, 1.29f, 2.15f)
                curveToRelative(0.3f, 0.57f, 0.61f, 1.15f, 0.95f, 1.71f)
                horizontalLineToRelative(-4.48f)
                close()
            }
        }.also { _CurveArrow = it}
