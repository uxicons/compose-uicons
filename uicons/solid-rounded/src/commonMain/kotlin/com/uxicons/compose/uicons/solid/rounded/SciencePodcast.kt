package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SciencePodcast: ImageVector? = null

val Icons.Sr.SciencePodcast: ImageVector
    get() = _SciencePodcast ?: UXIcon(name = "SciencePodcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 21.98f)
                verticalLineToRelative(1.02f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.02f)
                curveToRelative(-4.81f, -0.24f, -8.72f, -4.07f, -8.99f, -8.92f)
                curveToRelative(-0.03f, -0.55f, 0.39f, -1.02f, 0.94f, -1.05f)
                curveToRelative(0.54f, -0.06f, 1.02f, 0.39f, 1.05f, 0.94f)
                curveToRelative(0.22f, 3.96f, 3.49f, 7.05f, 7.46f, 7.05f)
                horizontalLineToRelative(1.06f)
                curveToRelative(3.97f, 0f, 7.24f, -3.1f, 7.46f, -7.05f)
                curveToRelative(0.03f, -0.55f, 0.5f, -1.01f, 1.05f, -0.94f)
                curveToRelative(0.55f, 0.03f, 0.97f, 0.5f, 0.94f, 1.05f)
                curveToRelative(-0.27f, 4.86f, -4.17f, 8.69f, -8.99f, 8.92f)
                close()
                moveTo(6f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(7f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _SciencePodcast = it}
