package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreakTime: ImageVector? = null

val Icons.Rs.BreakTime: ImageVector
    get() = _BreakTime ?: UXIcon(name = "BreakTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.05f)
                verticalLineToRelative(-2.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.05f)
                curveToRelative(-5.6f, 0.51f, -10f, 5.22f, -10f, 10.95f)
                curveToRelative(0f, 2.88f, 1.12f, 5.5f, 2.94f, 7.46f)
                lineToRelative(-1.93f, 2.12f)
                lineToRelative(1.48f, 1.35f)
                lineToRelative(1.94f, -2.13f)
                curveToRelative(1.84f, 1.38f, 4.11f, 2.2f, 6.58f, 2.2f)
                reflectiveCurveToRelative(4.74f, -0.83f, 6.58f, -2.2f)
                lineToRelative(1.94f, 2.13f)
                lineToRelative(1.48f, -1.35f)
                lineToRelative(-1.93f, -2.12f)
                curveToRelative(1.82f, -1.96f, 2.94f, -4.58f, 2.94f, -7.46f)
                curveToRelative(0f, -5.73f, -4.4f, -10.44f, -10f, -10.95f)
                close()
                moveTo(3f, 13f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -4.04f, -9f, -9f)
                close()
                moveTo(1.68f, 5.12f)
                lineTo(0.02f, 4.01f)
                curveToRelative(1.2f, -1.59f, 2.71f, -2.94f, 4.44f, -3.96f)
                lineToRelative(1.07f, 1.69f)
                curveToRelative(-1.49f, 0.86f, -2.8f, 2.01f, -3.84f, 3.38f)
                close()
                moveTo(18.48f, 1.75f)
                lineTo(19.54f, 0.06f)
                curveToRelative(1.73f, 1.01f, 3.24f, 2.36f, 4.44f, 3.96f)
                lineToRelative(-1.66f, 1.11f)
                curveToRelative(-1.04f, -1.36f, -2.35f, -2.51f, -3.84f, -3.38f)
                close()
                moveTo(17.5f, 11.4f)
                curveToRelative(0.03f, 1.04f, -0.43f, 2.24f, -1.5f, 3.42f)
                verticalLineToRelative(4.18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-11.0f)
                curveToRelative(0f, -1f, 0.75f, -1.19f, 1.22f, -0.84f)
                curveToRelative(0.82f, 0.58f, 2.18f, 2.1f, 2.28f, 4.24f)
                close()
                moveTo(9f, 7f)
                curveToRelative(-1.66f, 0f, -3f, 2.72f, -3f, 4.5f)
                curveToRelative(0f, 1.38f, 0.8f, 2.45f, 2f, 2.83f)
                verticalLineToRelative(4.67f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.67f)
                curveToRelative(1.2f, -0.39f, 2f, -1.45f, 2f, -2.83f)
                curveToRelative(0f, -1.78f, -1.34f, -4.5f, -3f, -4.5f)
                close()
                moveTo(9f, 12.5f)
                curveToRelative(-0.63f, 0f, -1f, -0.37f, -1f, -1f)
                curveToRelative(0f, -0.94f, 0.61f, -2.09f, 1f, -2.44f)
                curveToRelative(0.39f, 0.34f, 1f, 1.49f, 1f, 2.44f)
                curveToRelative(0f, 0.63f, -0.37f, 1f, -1f, 1f)
                close()
            }
        }.also { _BreakTime = it}
