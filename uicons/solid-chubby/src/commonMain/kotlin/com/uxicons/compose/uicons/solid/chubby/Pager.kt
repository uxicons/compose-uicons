package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pager: ImageVector? = null

val Icons.Sc.Pager: ImageVector
    get() = _Pager ?: UXIcon(name = "Pager") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 9f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 4.4f, -1.02f, 7.17f, -1.06f, 7.28f)
                curveToRelative(-0.1f, 0.28f, -0.32f, 0.49f, -0.6f, 0.59f)
                curveToRelative(-0.13f, 0.05f, -3.23f, 1.12f, -9.34f, 1.12f)
                reflectiveCurveToRelative(-9.21f, -1.08f, -9.34f, -1.12f)
                curveToRelative(-0.28f, -0.1f, -0.5f, -0.32f, -0.6f, -0.59f)
                curveToRelative(-0.04f, -0.12f, -1.06f, -2.89f, -1.06f, -7.28f)
                reflectiveCurveToRelative(1.02f, -7.17f, 1.06f, -7.28f)
                curveToRelative(0.1f, -0.28f, 0.32f, -0.49f, 0.6f, -0.59f)
                curveToRelative(0.13f, -0.05f, 3.23f, -1.12f, 9.34f, -1.12f)
                reflectiveCurveToRelative(9.21f, 1.08f, 9.34f, 1.12f)
                curveToRelative(0.28f, 0.1f, 0.5f, 0.32f, 0.6f, 0.59f)
                curveToRelative(0.04f, 0.12f, 1.06f, 2.89f, 1.06f, 7.28f)
                close()
                moveTo(8f, 16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(13.5f, 16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 16f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(19f, 8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Pager = it}
