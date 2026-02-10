package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveArrow: ImageVector? = null

val Icons.Rs.CurveArrow: ImageVector
    get() = _CurveArrow ?: UXIcon(name = "CurveArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.77f, 19.45f)
                lineToRelative(-2.77f, -2.95f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.96f, 0f, -1.95f, -1.88f, -2.76f, -3.38f)
                curveToRelative(-0.99f, -1.86f, -1.93f, -3.62f, -3.49f, -3.62f)
                reflectiveCurveToRelative(-2.5f, 1.76f, -3.49f, 3.62f)
                curveToRelative(-0.8f, 1.51f, -1.8f, 3.38f, -2.76f, 3.38f)
                horizontalLineToRelative(-0.75f)
                curveToRelative(0.61f, -1.29f, 1.18f, -3.21f, 1.88f, -5.72f)
                curveToRelative(0.69f, -2.43f, 1.96f, -6.93f, 2.87f, -7.27f)
                curveToRelative(0.57f, 0.21f, 1.28f, 2.06f, 1.91f, 4.01f)
                curveToRelative(0.11f, -0.01f, 0.23f, -0.02f, 0.34f, -0.02f)
                curveToRelative(0.72f, 0f, 1.34f, 0.18f, 1.89f, 0.47f)
                curveToRelative(-1.21f, -4.06f, -2.25f, -6.47f, -4.14f, -6.47f)
                curveToRelative(-2.21f, 0f, -3.26f, 3.32f, -4.79f, 8.74f)
                curveToRelative(-0.62f, 2.18f, -1.53f, 5.4f, -2.21f, 6.16f)
                lineTo(5f, 3f)
                horizontalLineToRelative(2.5f)
                lineTo(4.55f, 0.23f)
                curveToRelative(-0.3f, -0.3f, -0.8f, -0.3f, -1.1f, 0f)
                lineTo(0.5f, 3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2.5f)
                lineToRelative(2.77f, -2.95f)
                curveToRelative(0.3f, -0.3f, 0.3f, -0.8f, 0f, -1.1f)
                close()
                moveTo(12.52f, 16.56f)
                curveToRelative(0.46f, -0.86f, 1.31f, -2.47f, 1.72f, -2.56f)
                curveToRelative(0.42f, 0.09f, 1.28f, 1.69f, 1.74f, 2.56f)
                curveToRelative(0.44f, 0.83f, 0.91f, 1.69f, 1.44f, 2.44f)
                horizontalLineToRelative(-6.34f)
                curveToRelative(0.53f, -0.75f, 1.0f, -1.62f, 1.44f, -2.44f)
                close()
            }
        }.also { _CurveArrow = it}
