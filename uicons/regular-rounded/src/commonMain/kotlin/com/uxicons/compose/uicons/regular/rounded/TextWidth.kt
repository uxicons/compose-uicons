package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextWidth: ImageVector? = null

val Icons.Rr.TextWidth: ImageVector
    get() = _TextWidth ?: UXIcon(name = "TextWidth") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                verticalLineToRelative(-1.5f)
                curveTo(4f, 2.02f, 6.02f, 0f, 8.5f, 0f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(13f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(11f, 2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(24f, 19f)
                reflectiveCurveToRelative(0f, 0f, 0f, -0.01f)
                curveToRelative(0f, -0.51f, -0.2f, -1.02f, -0.58f, -1.4f)
                lineToRelative(-2.75f, -2.75f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.75f, 1.75f)
                lineTo(3f, 18f)
                lineToRelative(1.75f, -1.75f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.75f, 2.75f)
                curveTo(0.2f, 17.97f, 0f, 18.48f, 0f, 18.99f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0.01f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0.01f)
                curveToRelative(0f, 0.51f, 0.2f, 1.02f, 0.58f, 1.4f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-1.75f, -1.75f)
                lineTo(21f, 20f)
                lineToRelative(-1.75f, 1.75f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(2.75f, -2.75f)
                curveToRelative(0.39f, -0.39f, 0.58f, -0.9f, 0.58f, -1.4f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, -0.01f)
                close()
            }
        }.also { _TextWidth = it}
