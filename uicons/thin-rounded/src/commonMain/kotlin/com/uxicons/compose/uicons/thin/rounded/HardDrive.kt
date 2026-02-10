package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardDrive: ImageVector? = null

val Icons.Tr.HardDrive: ImageVector
    get() = _HardDrive ?: UXIcon(name = "HardDrive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(19f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23f, 17.25f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-13f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0f, -0.52f, 0.03f, -1.04f, 0.1f, -1.55f)
                lineToRelative(1.47f, -11.75f)
                curveToRelative(0.28f, -2.25f, 2.2f, -3.94f, 4.46f, -3.94f)
                horizontalLineToRelative(9.94f)
                curveToRelative(2.27f, 0f, 4.18f, 1.7f, 4.46f, 3.94f)
                lineToRelative(1.47f, 11.76f)
                curveToRelative(0.06f, 0.51f, 0.1f, 1.03f, 0.1f, 1.55f)
                close()
                moveTo(2.08f, 16f)
                horizontalLineToRelative(19.84f)
                curveToRelative(-0.01f, -0.06f, -1.48f, -11.93f, -1.48f, -11.93f)
                curveToRelative(-0.22f, -1.75f, -1.71f, -3.07f, -3.47f, -3.07f)
                horizontalLineToRelative(-9.94f)
                curveToRelative(-1.76f, 0f, -3.25f, 1.32f, -3.47f, 3.07f)
                curveToRelative(0f, 0f, -1.47f, 11.88f, -1.48f, 11.93f)
                close()
                moveTo(22f, 17.25f)
                curveToRelative(0f, -0.08f, -0.01f, -0.16f, -0.01f, -0.25f)
                horizontalLineToRelative(-19.97f)
                curveToRelative(-0.0f, 0.08f, -0.01f, 0.16f, -0.01f, 0.25f)
                verticalLineToRelative(2.25f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _HardDrive = it}
