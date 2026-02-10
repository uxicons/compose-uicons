package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleMicrophoneLines: ImageVector? = null

val Icons.Ss.CircleMicrophoneLines: ImageVector
    get() = _CircleMicrophoneLines ?: UXIcon(name = "CircleMicrophoneLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5f)
                close()
                moveTo(13f, 17.92f)
                verticalLineToRelative(2.08f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.08f)
                curveToRelative(-2.83f, -0.48f, -5f, -2.95f, -5f, -5.92f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 2.97f, -2.17f, 5.44f, -5f, 5.92f)
                close()
            }
        }.also { _CircleMicrophoneLines = it}
