package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HexagonExclamation: ImageVector? = null

val Icons.Ss.HexagonExclamation: ImageVector
    get() = _HexagonExclamation ?: UXIcon(name = "HexagonExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.64f, 10.55f)
                lineToRelative(-4.25f, -7.96f)
                curveToRelative(-0.52f, -0.98f, -1.54f, -1.59f, -2.65f, -1.59f)
                lineTo(7.28f, 1f)
                curveToRelative(-1.11f, 0f, -2.12f, 0.61f, -2.64f, 1.58f)
                lineTo(0.36f, 10.55f)
                curveToRelative(-0.49f, 0.91f, -0.49f, 2f, 0f, 2.91f)
                lineToRelative(4.27f, 7.96f)
                curveToRelative(0.52f, 0.98f, 1.54f, 1.58f, 2.64f, 1.58f)
                horizontalLineToRelative(9.46f)
                curveToRelative(1.11f, 0f, 2.12f, -0.61f, 2.65f, -1.59f)
                lineToRelative(4.25f, -7.96f)
                curveToRelative(0.48f, -0.91f, 0.48f, -1.99f, 0f, -2.9f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _HexagonExclamation = it}
