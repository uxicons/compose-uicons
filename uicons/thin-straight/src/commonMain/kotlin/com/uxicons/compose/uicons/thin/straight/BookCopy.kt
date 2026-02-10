package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCopy: ImageVector? = null

val Icons.Ts.BookCopy: ImageVector
    get() = _BookCopy ?: UXIcon(name = "BookCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10.77f)
                curveToRelative(0.53f, -0.48f, 1.23f, -0.77f, 2f, -0.77f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.16f, 0.36f, 0.35f, 0.69f, 0.58f, 1f)
                lineTo(3f, 19f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 1.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(-13f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(8f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(9f, 3f)
                verticalLineToRelative(10.77f)
                curveToRelative(0.53f, -0.48f, 1.23f, -0.77f, 2f, -0.77f)
                horizontalLineToRelative(12f)
                lineTo(23f, 1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-11.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(23f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-12f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _BookCopy = it}
