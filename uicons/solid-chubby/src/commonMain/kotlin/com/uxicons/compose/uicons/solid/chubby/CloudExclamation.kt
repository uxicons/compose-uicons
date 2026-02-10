package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Sc.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.98f, 10.42f)
                curveToRelative(-0.3f, -4.69f, -4.21f, -8.42f, -8.98f, -8.42f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 1.16f, 0.23f, 2.31f, 0.66f, 3.38f)
                curveToRelative(-1.03f, 0.79f, -1.66f, 2.03f, -1.66f, 3.37f)
                curveToRelative(0f, 2.34f, 1.91f, 4.25f, 4.25f, 4.25f)
                horizontalLineToRelative(11.5f)
                curveToRelative(3.45f, 0f, 6.25f, -2.8f, 6.25f, -6.25f)
                curveToRelative(0f, -2.21f, -1.14f, -4.2f, -3.02f, -5.33f)
                close()
                moveTo(11f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CloudExclamation = it}
