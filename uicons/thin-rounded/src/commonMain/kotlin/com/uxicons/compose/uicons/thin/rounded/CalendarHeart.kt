package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarHeart: ImageVector? = null

val Icons.Tr.CalendarHeart: ImageVector
    get() = _CalendarHeart ?: UXIcon(name = "CalendarHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.25f, 12f)
                curveToRelative(-0.96f, 0f, -1.76f, 0.41f, -2.25f, 1.09f)
                curveToRelative(-0.48f, -0.68f, -1.29f, -1.09f, -2.25f, -1.09f)
                curveToRelative(-1.52f, 0f, -2.75f, 1.31f, -2.75f, 2.93f)
                curveToRelative(0f, 2.12f, 2.55f, 4.71f, 3.9f, 5.78f)
                curveToRelative(0.33f, 0.26f, 0.71f, 0.39f, 1.1f, 0.39f)
                reflectiveCurveToRelative(0.78f, -0.13f, 1.1f, -0.39f)
                curveToRelative(1.35f, -1.07f, 3.9f, -3.67f, 3.9f, -5.78f)
                curveToRelative(0f, -1.62f, -1.23f, -2.93f, -2.75f, -2.93f)
                close()
                moveTo(12.48f, 19.93f)
                curveToRelative(-0.28f, 0.23f, -0.68f, 0.23f, -0.96f, 0f)
                curveToRelative(-1.46f, -1.17f, -3.52f, -3.49f, -3.52f, -5f)
                curveToRelative(0f, -1.06f, 0.79f, -1.93f, 1.75f, -1.93f)
                curveToRelative(1.03f, 0f, 1.75f, 0.7f, 1.75f, 1.71f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.01f, 0.72f, -1.71f, 1.75f, -1.71f)
                curveToRelative(0.96f, 0f, 1.75f, 0.87f, 1.75f, 1.93f)
                curveToRelative(0f, 1.51f, -2.06f, 3.83f, -3.52f, 5f)
                close()
                moveTo(19.5f, 2f)
                horizontalLineToRelative(-1.5f)
                lineTo(18f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(7f, 2f)
                lineTo(7f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(19.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _CalendarHeart = it}
