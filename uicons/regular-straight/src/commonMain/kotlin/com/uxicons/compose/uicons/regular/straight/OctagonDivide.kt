package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonDivide: ImageVector? = null

val Icons.Rs.OctagonDivide: ImageVector
    get() = _OctagonDivide ?: UXIcon(name = "OctagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(12f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 8.27f)
                verticalLineToRelative(7.46f)
                curveToRelative(0f, 0.8f, -0.31f, 1.55f, -0.88f, 2.12f)
                lineToRelative(-5.27f, 5.27f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                horizontalLineToRelative(-7.46f)
                curveToRelative(-0.8f, 0f, -1.55f, -0.31f, -2.12f, -0.88f)
                lineTo(0.88f, 17.85f)
                curveToRelative(-0.57f, -0.57f, -0.88f, -1.32f, -0.88f, -2.12f)
                verticalLineToRelative(-7.46f)
                curveToRelative(0f, -0.8f, 0.31f, -1.55f, 0.88f, -2.12f)
                lineTo(6.15f, 0.88f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.12f, -0.88f)
                horizontalLineToRelative(7.46f)
                curveToRelative(0.8f, 0f, 1.55f, 0.31f, 2.12f, 0.88f)
                lineToRelative(5.27f, 5.27f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                close()
                moveTo(22f, 8.27f)
                curveToRelative(0f, -0.26f, -0.11f, -0.52f, -0.29f, -0.71f)
                lineToRelative(-5.27f, -5.27f)
                curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
                horizontalLineToRelative(-7.46f)
                curveToRelative(-0.26f, 0f, -0.52f, 0.11f, -0.71f, 0.29f)
                lineTo(2.29f, 7.57f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.44f, -0.29f, 0.71f)
                verticalLineToRelative(7.46f)
                curveToRelative(0f, 0.26f, 0.11f, 0.52f, 0.29f, 0.71f)
                lineToRelative(5.27f, 5.27f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.71f, 0.29f)
                horizontalLineToRelative(7.46f)
                curveToRelative(0.26f, 0f, 0.52f, -0.11f, 0.71f, -0.29f)
                lineToRelative(5.27f, -5.27f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                verticalLineToRelative(-7.46f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                lineTo(7f, 11f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _OctagonDivide = it}
