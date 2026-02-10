package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Rc.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(11f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(19.98f, 10.42f)
                curveToRelative(-0.3f, -4.69f, -4.21f, -8.42f, -8.98f, -8.42f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 1.16f, 0.23f, 2.31f, 0.66f, 3.38f)
                curveToRelative(-1.03f, 0.79f, -1.66f, 2.03f, -1.66f, 3.37f)
                curveToRelative(0f, 2.34f, 1.91f, 4.25f, 4.25f, 4.25f)
                horizontalLineToRelative(1.75f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(-1.24f, 0f, -2.25f, -1.01f, -2.25f, -2.25f)
                curveToRelative(0f, -0.89f, 0.53f, -1.7f, 1.35f, -2.06f)
                curveToRelative(0.26f, -0.11f, 0.45f, -0.33f, 0.54f, -0.59f)
                reflectiveCurveToRelative(0.07f, -0.55f, -0.06f, -0.8f)
                curveToRelative(-0.55f, -1.02f, -0.83f, -2.14f, -0.83f, -3.3f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7.0f, 7.02f)
                curveToRelative(0f, 0.39f, 0.22f, 0.74f, 0.57f, 0.9f)
                curveToRelative(1.5f, 0.72f, 2.43f, 2.18f, 2.43f, 3.82f)
                curveToRelative(0f, 2.34f, -1.91f, 4.25f, -4.25f, 4.25f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.75f)
                curveToRelative(3.45f, 0f, 6.25f, -2.8f, 6.25f, -6.25f)
                curveToRelative(0f, -2.21f, -1.14f, -4.2f, -3.02f, -5.33f)
                close()
            }
        }.also { _CloudExclamation = it}
