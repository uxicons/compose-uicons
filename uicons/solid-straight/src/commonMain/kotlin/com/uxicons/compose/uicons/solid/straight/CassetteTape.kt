package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CassetteTape: ImageVector? = null

val Icons.Ss.CassetteTape: ImageVector
    get() = _CassetteTape ?: UXIcon(name = "CassetteTape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.41f, 19.02f)
                lineToRelative(1.08f, 1.98f)
                lineTo(6.51f, 21f)
                lineToRelative(1.08f, -1.98f)
                horizontalLineToRelative(8.81f)
                close()
                moveTo(14.19f, 10f)
                horizontalLineToRelative(-4.37f)
                curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1f)
                reflectiveCurveToRelative(-0.07f, 0.69f, -0.18f, 1f)
                horizontalLineToRelative(4.37f)
                curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1f)
                reflectiveCurveToRelative(0.07f, -0.69f, 0.18f, -1f)
                close()
                moveTo(7.01f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-4.24f)
                lineToRelative(-2.17f, -3.98f)
                lineTo(6.41f, 17.02f)
                lineToRelative(-2.17f, 3.98f)
                lineTo(0f, 21f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(21f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(20f, 11f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(7f, 8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
                moveTo(17f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _CassetteTape = it}
