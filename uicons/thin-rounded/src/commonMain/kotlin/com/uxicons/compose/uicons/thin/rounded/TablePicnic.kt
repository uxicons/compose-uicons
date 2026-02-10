package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TablePicnic: ImageVector? = null

val Icons.Tr.TablePicnic: ImageVector
    get() = _TablePicnic ?: UXIcon(name = "TablePicnic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.18f, 14f)
                horizontalLineToRelative(2.32f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.76f)
                lineToRelative(-3.97f, -9f)
                horizontalLineToRelative(3.73f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-0.01f, 0f, -0.01f, 0f, -0.02f, 0f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.73f)
                lineTo(3.26f, 13f)
                lineTo(0.5f, 13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(2.82f, 14f)
                lineTo(0.04f, 20.3f)
                curveToRelative(-0.11f, 0.25f, 0.0f, 0.55f, 0.26f, 0.66f)
                curveToRelative(0.07f, 0.03f, 0.14f, 0.04f, 0.2f, 0.04f)
                curveToRelative(0.19f, 0f, 0.38f, -0.11f, 0.46f, -0.3f)
                lineToRelative(2.96f, -6.7f)
                lineTo(20.09f, 14f)
                lineToRelative(2.96f, 6.7f)
                curveToRelative(0.08f, 0.19f, 0.27f, 0.3f, 0.46f, 0.3f)
                curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.2f, -0.04f)
                curveToRelative(0.25f, -0.11f, 0.37f, -0.41f, 0.26f, -0.66f)
                lineToRelative(-2.78f, -6.3f)
                close()
                moveTo(4.36f, 13f)
                lineToRelative(3.97f, -9f)
                horizontalLineToRelative(7.35f)
                lineToRelative(3.97f, 9f)
                lineTo(4.36f, 13f)
                close()
            }
        }.also { _TablePicnic = it}
