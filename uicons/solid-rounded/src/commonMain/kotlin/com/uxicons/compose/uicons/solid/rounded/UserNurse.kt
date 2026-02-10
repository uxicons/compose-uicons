package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserNurse: ImageVector? = null

val Icons.Sr.UserNurse: ImageVector
    get() = _UserNurse ?: UXIcon(name = "UserNurse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 0f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(18f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(4.01f, 24f)
                curveToRelative(-0.6f, 0f, -1.07f, -0.52f, -1f, -1.11f)
                curveToRelative(0.24f, -2.04f, 1.17f, -4.22f, 2.46f, -5.42f)
                curveToRelative(0.73f, -0.68f, 1.89f, -0.6f, 2.55f, 0.15f)
                lineToRelative(3.99f, 5.01f)
                lineToRelative(4.0f, -5.01f)
                curveToRelative(0.66f, -0.74f, 1.82f, -0.82f, 2.55f, -0.14f)
                curveToRelative(1.28f, 1.2f, 2.21f, 3.38f, 2.45f, 5.41f)
                curveToRelative(0.07f, 0.59f, -0.4f, 1.11f, -1f, 1.11f)
                lineTo(4.01f, 24.0f)
                close()
                moveTo(6f, 10f)
                horizontalLineToRelative(12f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
            }
        }.also { _UserNurse = it}
