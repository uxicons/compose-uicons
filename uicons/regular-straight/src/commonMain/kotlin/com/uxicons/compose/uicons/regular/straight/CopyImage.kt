package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyImage: ImageVector? = null

val Icons.Rs.CopyImage: ImageVector
    get() = _CopyImage ?: UXIcon(name = "CopyImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(13f)
                lineTo(5f, 18f)
                lineTo(5f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7f, 5f)
                lineTo(7f, 15.78f)
                lineToRelative(7.85f, -7.85f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(3.85f, -3.85f)
                verticalLineToRelative(-2.38f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(8f, 4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 16f)
                verticalLineToRelative(-5.79f)
                lineToRelative(-3.85f, 3.85f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-5.24f, 5.24f)
                horizontalLineToRelative(12.39f)
                close()
                moveTo(2f, 9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                lineTo(19f, 22f)
                verticalLineToRelative(-2f)
                lineTo(2f, 20f)
                lineTo(2f, 9f)
                close()
            }
        }.also { _CopyImage = it}
