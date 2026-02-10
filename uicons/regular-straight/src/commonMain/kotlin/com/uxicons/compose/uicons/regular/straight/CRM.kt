package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CRM: ImageVector? = null

val Icons.Rs.CRM: ImageVector
    get() = _CRM ?: UXIcon(name = "CRM") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.0f, 10.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveTo(-0.0f, 16.43f, -0.0f, 14.5f)
                verticalLineToRelative(-4f)
                curveTo(-0.0f, 8.57f, 1.57f, 7f, 3.5f, 7f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(13.28f, 13.13f)
                lineToRelative(1.22f, 4.87f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(-1.01f, -4.04f)
                curveToRelative(-0.12f, 0.01f, -0.23f, 0.04f, -0.36f, 0.04f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                lineTo(8.0f, 7f)
                horizontalLineToRelative(3f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 1.05f, -0.48f, 1.99f, -1.22f, 2.63f)
                close()
                moveTo(11.0f, 12f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(23.34f, 8.3f)
                curveToRelative(-0.05f, -0.91f, -0.59f, -1.3f, -1.23f, -1.3f)
                curveToRelative(-0.42f, 0f, -0.82f, 0.31f, -1.04f, 0.83f)
                lineToRelative(-1.43f, 2.89f)
                lineToRelative(-1.45f, -2.89f)
                curveToRelative(-0.22f, -0.52f, -0.62f, -0.83f, -1.04f, -0.83f)
                curveToRelative(-0.64f, 0f, -1.17f, 0.38f, -1.22f, 1.3f)
                lineToRelative(-0.67f, 9.7f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.46f, -6.66f)
                lineToRelative(1.93f, 3.85f)
                lineToRelative(1.9f, -3.82f)
                lineToRelative(0.45f, 6.62f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-0.66f, -9.7f)
                close()
            }
        }.also { _CRM = it}
