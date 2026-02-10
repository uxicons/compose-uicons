package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CryptoCalendar: ImageVector? = null

val Icons.Rs.CryptoCalendar: ImageVector
    get() = _CryptoCalendar ?: UXIcon(name = "CryptoCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.8f, 17.2f)
                horizontalLineToRelative(-1.95f)
                verticalLineToRelative(-1.4f)
                horizontalLineToRelative(1.95f)
                curveToRelative(0.39f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                reflectiveCurveToRelative(-0.31f, 0.7f, -0.7f, 0.7f)
                close()
                moveTo(19.3f, 18.8f)
                horizontalLineToRelative(-2.45f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(2.45f)
                curveToRelative(0.39f, 0f, 0.7f, -0.31f, 0.7f, -0.7f)
                reflectiveCurveToRelative(-0.31f, -0.7f, -0.7f, -0.7f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(21.6f, 19.5f)
                curveToRelative(0f, -0.72f, -0.33f, -1.36f, -0.85f, -1.78f)
                curveToRelative(0.22f, -0.35f, 0.35f, -0.77f, 0.35f, -1.22f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(-1.95f)
                verticalLineToRelative(7.6f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(1.2f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.27f, 0f, 2.3f, -1.03f, 2.3f, -2.3f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(7.72f)
                curveToRelative(-0.57f, -0.65f, -1.25f, -1.21f, -2f, -1.64f)
                verticalLineToRelative(-1.08f)
                lineTo(2f, 10f)
                verticalLineToRelative(12f)
                lineTo(11.08f, 22f)
                curveToRelative(0.44f, 0.75f, 0.99f, 1.43f, 1.64f, 2f)
                lineTo(0f, 24f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(2f)
                lineTo(8f, 2f)
                horizontalLineToRelative(8f)
                lineTo(16f, 0f)
                horizontalLineToRelative(2f)
                lineTo(18f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 8f)
                lineTo(22f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -0.89f, -1f)
                lineTo(3.12f, 4f)
                curveToRelative(-0.67f, 0f, -1.11f, 0.45f, -1.11f, 1f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _CryptoCalendar = it}
