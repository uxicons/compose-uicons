package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LegalCase: ImageVector? = null

val Icons.Bs.LegalCase: ImageVector
    get() = _LegalCase ?: UXIcon(name = "LegalCase") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.19f, 19.31f)
                lineToRelative(-1.32f, 1.32f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-5f, -5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(4.68f, -4.68f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(5f, 5f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-0.75f, -0.75f)
                lineToRelative(-1.23f, 1.23f)
                lineToRelative(4.75f, 4.75f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-4.75f, -4.75f)
                close()
                moveTo(3f, 21f)
                lineTo(3f, 3f)
                lineTo(12f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(6.24f)
                lineToRelative(1.76f, 1.76f)
                lineTo(20f, 5.67f)
                lineTo(14.38f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(13.58f, 24f)
                lineToRelative(-3f, -3f)
                lineTo(3f, 21f)
                close()
                moveTo(5f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                lineTo(5f, 5f)
                close()
                moveTo(15.11f, 10f)
                lineTo(5f, 10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7.11f)
                lineToRelative(3f, -3f)
                close()
                moveTo(5f, 18f)
                horizontalLineToRelative(2.11f)
                lineToRelative(3f, -3f)
                lineTo(5f, 15f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _LegalCase = it}
