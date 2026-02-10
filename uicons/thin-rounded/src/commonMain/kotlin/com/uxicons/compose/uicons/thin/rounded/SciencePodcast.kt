package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SciencePodcast: ImageVector? = null

val Icons.Tr.SciencePodcast: ImageVector
    get() = _SciencePodcast ?: UXIcon(name = "SciencePodcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(16f, 6f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(22f, 12.56f)
                curveToRelative(0.0f, 5.23f, -4.27f, 9.47f, -9.5f, 9.44f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-5.23f, 0.03f, -9.5f, -4.21f, -9.5f, -9.44f)
                verticalLineToRelative(-0.56f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(0.56f)
                curveToRelative(0f, 4.65f, 3.79f, 8.44f, 8.44f, 8.44f)
                horizontalLineToRelative(1.12f)
                curveToRelative(4.66f, 0f, 8.44f, -3.79f, 8.44f, -8.44f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _SciencePodcast = it}
