package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CassetteTape: ImageVector? = null

val Icons.Sr.CassetteTape: ImageVector
    get() = _CassetteTape ?: UXIcon(name = "CassetteTape") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(7.54f, 19f)
                lineToRelative(-1.33f, 2f)
                horizontalLineToRelative(11.6f)
                lineToRelative(-1.33f, -2f)
                lineTo(7.54f, 19f)
                close()
                moveTo(9.82f, 12f)
                horizontalLineToRelative(4.37f)
                curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1f)
                reflectiveCurveToRelative(0.07f, -0.69f, 0.18f, -1f)
                horizontalLineToRelative(-4.37f)
                curveToRelative(0.11f, 0.31f, 0.18f, 0.65f, 0.18f, 1f)
                reflectiveCurveToRelative(-0.07f, 0.69f, -0.18f, 1f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.37f, -1.67f, 4.36f, -3.89f, 4.87f)
                lineToRelative(-2.28f, -3.42f)
                curveToRelative(-0.19f, -0.28f, -0.5f, -0.45f, -0.83f, -0.45f)
                lineTo(7f, 17f)
                curveToRelative(-0.33f, 0f, -0.65f, 0.17f, -0.83f, 0.45f)
                lineToRelative(-2.28f, 3.42f)
                curveToRelative(-2.22f, -0.51f, -3.89f, -2.49f, -3.89f, -4.87f)
                lineTo(0f, 8f)
                curveTo(0f, 5.24f, 2.24f, 3f, 5f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
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
