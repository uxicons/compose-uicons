package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCopy: ImageVector? = null

val Icons.Tr.BookCopy: ImageVector
    get() = _BookCopy ?: UXIcon(name = "BookCopy") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                lineTo(24f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(12f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.29f, -2f, 0.77f)
                lineTo(9f, 4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(15.62f, 21.71f)
                curveToRelative(-0.66f, 1.39f, -2.08f, 2.29f, -3.62f, 2.29f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9.77f)
                curveToRelative(0.53f, -0.48f, 1.23f, -0.77f, 2f, -0.77f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.15f, 0f, 2.22f, -0.67f, 2.71f, -1.72f)
                curveToRelative(0.12f, -0.25f, 0.42f, -0.35f, 0.67f, -0.24f)
                curveToRelative(0.25f, 0.12f, 0.36f, 0.42f, 0.24f, 0.67f)
                close()
            }
        }.also { _BookCopy = it}
