package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListDropdown: ImageVector? = null

val Icons.Tr.ListDropdown: ImageVector
    get() = _ListDropdown ?: UXIcon(name = "ListDropdown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4.5f)
                lineTo(1f, 9f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(19.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 10f)
                lineTo(23f, 10f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(19f, 18.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(19f, 14.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 15f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(15.61f, 7.4f)
                curveToRelative(0.25f, 0.25f, 0.58f, 0.37f, 0.9f, 0.37f)
                reflectiveCurveToRelative(0.64f, -0.12f, 0.88f, -0.36f)
                lineToRelative(2.45f, -2.25f)
                curveToRelative(0.36f, -0.36f, 0.47f, -0.91f, 0.28f, -1.38f)
                curveToRelative(-0.2f, -0.48f, -0.66f, -0.78f, -1.17f, -0.78f)
                horizontalLineToRelative(-4.87f)
                curveToRelative(-0.52f, 0f, -0.98f, 0.31f, -1.17f, 0.78f)
                curveToRelative(-0.2f, 0.48f, -0.09f, 1.02f, 0.29f, 1.4f)
                lineToRelative(2.42f, 2.21f)
                close()
                moveTo(13.82f, 4.17f)
                reflectiveCurveToRelative(0.09f, -0.17f, 0.25f, -0.17f)
                horizontalLineToRelative(4.87f)
                curveToRelative(0.16f, 0f, 0.23f, 0.12f, 0.25f, 0.17f)
                curveToRelative(0.02f, 0.05f, 0.06f, 0.18f, -0.04f, 0.28f)
                lineToRelative(-2.45f, 2.25f)
                curveToRelative(-0.1f, 0.1f, -0.26f, 0.12f, -0.4f, -0.02f)
                lineToRelative(-2.42f, -2.21f)
                curveToRelative(-0.12f, -0.12f, -0.08f, -0.24f, -0.06f, -0.29f)
                close()
            }
        }.also { _ListDropdown = it}
