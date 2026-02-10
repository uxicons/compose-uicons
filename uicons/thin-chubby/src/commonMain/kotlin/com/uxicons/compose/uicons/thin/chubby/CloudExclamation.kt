package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Tc.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 18f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(11.5f, 20.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
                moveTo(19.97f, 10.39f)
                curveToRelative(-0.31f, -4.73f, -4.2f, -8.39f, -8.97f, -8.39f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                curveToRelative(0f, 1.17f, 0.23f, 2.3f, 0.67f, 3.39f)
                curveToRelative(-1.05f, 0.8f, -1.67f, 2.03f, -1.67f, 3.36f)
                curveToRelative(0f, 2.34f, 1.91f, 4.25f, 4.25f, 4.25f)
                horizontalLineToRelative(2.75f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.75f)
                curveToRelative(-1.79f, 0f, -3.25f, -1.46f, -3.25f, -3.25f)
                curveToRelative(0f, -1.13f, 0.58f, -2.16f, 1.55f, -2.76f)
                curveToRelative(0.22f, -0.13f, 0.3f, -0.41f, 0.19f, -0.64f)
                curveToRelative(-0.49f, -1.07f, -0.74f, -2.2f, -0.74f, -3.35f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                curveToRelative(4.32f, 0f, 7.83f, 3.39f, 7.99f, 7.71f)
                curveToRelative(0.01f, 0.18f, 0.1f, 0.34f, 0.26f, 0.42f)
                curveToRelative(1.7f, 0.92f, 2.75f, 2.69f, 2.75f, 4.62f)
                curveToRelative(0f, 2.9f, -2.35f, 5.25f, -5.25f, 5.25f)
                horizontalLineToRelative(-1.75f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.75f)
                curveToRelative(3.45f, 0f, 6.25f, -2.8f, 6.25f, -6.25f)
                curveToRelative(0f, -2.2f, -1.15f, -4.23f, -3.03f, -5.36f)
                close()
            }
        }.also { _CloudExclamation = it}
