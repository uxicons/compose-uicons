package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyImage: ImageVector? = null

val Icons.Ts.CopyImage: ImageVector
    get() = _CopyImage ?: UXIcon(name = "CopyImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(13.5f)
                lineTo(4f, 18f)
                lineTo(4f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(5f, 4.5f)
                verticalLineToRelative(12.32f)
                lineTo(13.03f, 8.79f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(6.67f, -6.67f)
                verticalLineToRelative(-0.92f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(6.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 17f)
                lineTo(23f, 6.83f)
                lineToRelative(-6.67f, 6.67f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-6.79f, 6.79f)
                lineTo(23f, 16.99f)
                close()
                moveTo(1f, 8.5f)
                curveToRelative(0f, -0.65f, 0.42f, -1.2f, 1f, -1.41f)
                verticalLineToRelative(-1.04f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(13.5f)
                lineTo(20f, 22f)
                verticalLineToRelative(-1f)
                lineTo(1f, 21f)
                lineTo(1f, 8.5f)
                close()
            }
        }.also { _CopyImage = it}
