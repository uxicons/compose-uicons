package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CRM: ImageVector? = null

val Icons.Bs.CRM: ImageVector
    get() = _CRM ?: UXIcon(name = "CRM") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.25f, 10.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-0.75f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.75f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(0.5f)
                lineToRelative(1f, 4f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-1.22f, -4.87f)
                curveToRelative(0.74f, -0.64f, 1.22f, -1.58f, 1.22f, -2.63f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(0f)
                close()
                moveTo(3.5f, 15.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(17.76f, 18f)
                lineToRelative(0.33f, -4.79f)
                lineToRelative(1.56f, 3.1f)
                lineToRelative(1.52f, -3.07f)
                lineToRelative(0.33f, 4.75f)
                horizontalLineToRelative(2.51f)
                lineToRelative(-0.67f, -9.7f)
                curveToRelative(-0.05f, -0.91f, -0.59f, -1.3f, -1.23f, -1.3f)
                curveToRelative(-0.42f, 0f, -0.82f, 0.31f, -1.04f, 0.83f)
                lineToRelative(-1.43f, 2.89f)
                lineToRelative(-1.45f, -2.89f)
                curveToRelative(-0.22f, -0.52f, -0.62f, -0.83f, -1.04f, -0.83f)
                curveToRelative(-0.64f, 0f, -1.17f, 0.38f, -1.22f, 1.3f)
                lineToRelative(-0.66f, 9.7f)
                horizontalLineToRelative(2.51f)
                close()
            }
        }.also { _CRM = it}
