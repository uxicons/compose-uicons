package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeSnow: ImageVector? = null

val Icons.Sr.GlobeSnow: ImageVector
    get() = _GlobeSnow ?: UXIcon(name = "GlobeSnow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 22f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(5f, 19f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(11f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.6f)
                curveToRelative(-0.84f, 0f, -1.32f, -0.96f, -0.82f, -1.64f)
                lineToRelative(0.91f, -1.34f)
                horizontalLineToRelative(-0.14f)
                curveToRelative(-0.73f, 0f, -1.15f, -0.83f, -0.71f, -1.42f)
                lineToRelative(2.41f, -3.08f)
                curveToRelative(0.49f, -0.66f, 1.49f, -0.66f, 1.98f, 0f)
                lineToRelative(2.41f, 3.08f)
                curveToRelative(0.44f, 0.58f, 0.02f, 1.42f, -0.71f, 1.42f)
                horizontalLineToRelative(-0.14f)
                lineToRelative(0.91f, 1.34f)
                curveToRelative(0.51f, 0.68f, 0.03f, 1.64f, -0.82f, 1.64f)
                horizontalLineToRelative(-1.68f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8.09f)
                curveToRelative(1.17f, -1.77f, 1.81f, -3.85f, 1.81f, -6.05f)
                curveTo(22.9f, 4.88f, 17.96f, -0.05f, 11.9f, -0.05f)
                reflectiveCurveTo(0.9f, 4.88f, 0.9f, 10.95f)
                curveToRelative(0f, 2.2f, 0.64f, 4.28f, 1.81f, 6.05f)
                horizontalLineToRelative(8.3f)
                close()
                moveTo(18.5f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(14.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _GlobeSnow = it}
